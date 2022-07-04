package com.ids.Negocio.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="language_table")
public class Language {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name="language_code")
    String code;
    @Column(name="language_name")
    String name;
}
