package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ProductoCrudRepository;
import com.platzi.market.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository //Con esto indicamos a Spring que esta clase interactua con la base de datos
public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    //Retornará una lista de todos los productos
    public List<Producto> getAll(){
        //findAll return un iterable
        return (List<Producto>) productoCrudRepository.findAll();

    }

    //Consulta para traer cantidad de stock y que se estan vendiendo
    public List<Producto> getByCategoria(int idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    //Consulta para obtener una lista de productos escasos
    public Optional<List<Producto>> getEscasos(int cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad,true);
    }

    //Obtener un producto por medio del id
    public Optional<Producto> getProducto(int idProducto){
        return productoCrudRepository.findById(idProducto);
    }

    //Guardar un producto
    public Producto save(Producto producto){
        return productoCrudRepository.save(producto);
    }

    public void delete(int idProducto){
        productoCrudRepository.deleteById(idProducto);
    }
}
