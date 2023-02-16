package com.platzi.market.domain.repository;

import com.platzi.market.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    /**Esta interface es implementada para el dominio, tien los mismo métodos de producto, pero la clase
     * producto tiene los métodos dirigidos a la base de datos, con esta mapeamos los métodos y se realiza
     * su traducción**/

    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryID);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);

}
