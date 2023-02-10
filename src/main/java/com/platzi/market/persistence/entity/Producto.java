package com.platzi.market.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {

    @Id //Como es llave primaria se coloca esta notación
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Sirve para realizar el autoincremento
    @Column(name = "id_producto")//Nombre del atributo en la base de datos
    private Integer idProducto;

    /**@Column(name = "nombre") Se le debería colocar la notación pero como tienen el mismo nombre
     * que en la base de datos no es necesario**/
    private String nombre;

    @Column(name = "id_categoria")//Nombre del atributo en la base de datos
    private Integer idCategoria;

    @Column(name = "codigo_barras")//Nombre del atributo en la base de datos
    private Character codigoBarras;

    @Column(name = "precio_venta")//Nombre del atributo en la base de datos
    private Double precioVenta;

    @Column(name = "cantidad_stock")//Nombre del atributo en la base de datos
    private Integer cantidadStock;

    private Boolean estado;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Character getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(Character codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
