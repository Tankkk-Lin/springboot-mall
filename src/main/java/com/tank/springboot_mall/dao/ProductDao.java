package com.tank.springboot_mall.dao;

import com.tank.springboot_mall.dto.ProductRequest;
import com.tank.springboot_mall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts();

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
