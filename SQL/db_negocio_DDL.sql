use db_negocio;

drop database if exists db_negocio;

create database db_negocio;

use db_negocio;


drop table if exists employee;

drop table if exists country;

drop table if exists language_table;

drop table if exists airport;


show tables;


create table employee(
	id int auto_increment primary key,
	surname varchar(35) not null,
	firstname varchar(35) not null
);




create table country(
	id int auto_increment primary key,
	country_code varchar(50) not null,
	country_name varchar(50) not null

	
);


create table airport(

	id int auto_increment primary key,
	airport_name varchar(150) not null 

);

create table language_table(

	id int auto_increment primary key,
	language_code varchar(50) not null, 
	language_name varchar(50) not null
	
);
