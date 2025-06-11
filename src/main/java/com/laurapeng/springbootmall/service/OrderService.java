package com.laurapeng.springbootmall.service;

import com.laurapeng.springbootmall.dto.CreateOrderRequest;
import com.laurapeng.springbootmall.dto.OrderQueryParams;
import com.laurapeng.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
