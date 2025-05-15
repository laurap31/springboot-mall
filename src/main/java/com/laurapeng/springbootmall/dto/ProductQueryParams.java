package com.laurapeng.springbootmall.dto;

import com.laurapeng.springbootmall.constant.ProductCategory;
import lombok.Data;

@Data
public class ProductQueryParams {

    private ProductCategory category;
    private String search;
}
