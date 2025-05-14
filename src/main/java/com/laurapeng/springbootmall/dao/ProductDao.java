package com.laurapeng.springbootmall.dao;

import com.laurapeng.springbootmall.dto.ProductRequest;
import com.laurapeng.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
