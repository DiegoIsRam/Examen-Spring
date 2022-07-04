package com.ids.Negocio.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name="country_code")
    String code;
    @Column(name="country_name")
    String name;

}
