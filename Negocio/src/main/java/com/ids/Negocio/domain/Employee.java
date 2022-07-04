package com.ids.Negocio.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    String surname;
    String firstname;
}
