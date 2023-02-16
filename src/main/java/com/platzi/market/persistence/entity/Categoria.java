package com.platzi.market.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer idCategoria;

    private Character descripcion;

    private Boolean estado;

    public Integer getCategoria() {
        return idCategoria;
    }

    public void setCategoria(Integer categoria) {
        this.idCategoria = categoria;
    }

    public Character getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Character descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
