package com.laurapeng.springbootmall.service;

import com.laurapeng.springbootmall.dto.CreateOrderRequest;
import com.laurapeng.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
