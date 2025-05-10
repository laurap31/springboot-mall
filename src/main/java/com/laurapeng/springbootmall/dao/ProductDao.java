package com.laurapeng.springbootmall.dao;

import com.laurapeng.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

}
