package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository; //CrudRepository se extiende de esta librería

//EL crudrepository tien dos atributos <la tabla en este caso(Producto) , y el tipo de dato de la primary key de la tabla producto(Integer)>
public interface ProductoCrudRepository extends CrudRepository <Producto,Integer>{

}
