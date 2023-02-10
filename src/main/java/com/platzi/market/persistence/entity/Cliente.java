package com.platzi.market.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Character id;

    private Character nombre;

    private Character apellidos;
    private Integer celular;
    private Character direccion;
    @Column(name = "correo_electronico")
    private Character correoElectronico;
}
