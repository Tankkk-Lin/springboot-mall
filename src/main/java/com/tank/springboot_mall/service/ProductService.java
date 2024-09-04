package com.tank.springboot_mall.service;

import com.tank.springboot_mall.dto.ProductRequest;
import com.tank.springboot_mall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
