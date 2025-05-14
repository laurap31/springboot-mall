package com.laurapeng.springbootmall.service;

import com.laurapeng.springbootmall.dto.ProductRequest;
import com.laurapeng.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
