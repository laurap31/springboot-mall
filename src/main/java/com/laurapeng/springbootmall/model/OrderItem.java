package com.laurapeng.springbootmall.model;

import lombok.Data;

@Data
public class OrderItem {

    private Integer OrderItemId;
    private Integer OrderId;
    private Integer ProductId;
    private Integer Quantity;
    private Integer amount;

    private String productName;
    private String imageUrl;
}
