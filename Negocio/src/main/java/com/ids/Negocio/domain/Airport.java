package com.ids.Negocio.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="airport")
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name="airport_name")
    String name;
}
