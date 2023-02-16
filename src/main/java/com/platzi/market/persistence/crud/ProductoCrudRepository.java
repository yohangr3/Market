package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository; //CrudRepository se extiende de esta librería

import java.util.List;
import java.util.Optional;

//EL crudrepository tien dos atributos <la tabla en este caso(Producto) , y el tipo de dato de la primary key de la tabla producto(Integer)>
public interface ProductoCrudRepository extends CrudRepository <Producto,Integer>{
    /**Llamar por sentencias SQL
     * @Query(value = "SELECT * FROM productos WHERE id_categoria = ?" , nativeQuery = true)
     * De esta forma se realiza la consulta **/

    //Consulta con Query Methods
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    //Traer los produstos que están excasos, es menor que (LessThan)
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock,boolean estado);


}
