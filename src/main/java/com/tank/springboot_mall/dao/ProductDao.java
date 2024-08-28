package com.tank.springboot_mall.dao;

import com.tank.springboot_mall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
