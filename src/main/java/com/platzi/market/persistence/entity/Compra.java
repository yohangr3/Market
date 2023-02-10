package com.platzi.market.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "compras")
public class Compra {

    @Id //Se coloca esta notación ya que es la llave primaria de esta colomna (compras)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")//Nombre del atributo en la base de datos
    private Integer idCompra;


    @Column(name = "id_cliente")//Nombre del atributo en la base de datos
    private Character idCliente;

    private LocalDateTime fecha;

    @Column(name = "medio_pago")//Nombre del atributo en la base de datos
    private Character medioPago;

    private Character comentario;

    private Character estado;

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Character getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Character idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Character getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(Character medioPago) {
        this.medioPago = medioPago;
    }

    public Character getComentario() {
        return comentario;
    }

    public void setComentario(Character comentario) {
        this.comentario = comentario;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }
}


