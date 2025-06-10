package com.laurapeng.springbootmall.service.impl;

import com.laurapeng.springbootmall.dao.OrderDao;
import com.laurapeng.springbootmall.dao.ProductDao;
import com.laurapeng.springbootmall.dto.BuyItem;
import com.laurapeng.springbootmall.dto.CreateOrderRequest;
import com.laurapeng.springbootmall.model.OrderItem;
import com.laurapeng.springbootmall.model.Product;
import com.laurapeng.springbootmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private ProductDao productDao;

    @Transactional
    @Override
    public Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest) {
        int totalAmount = 0;
        List<OrderItem> orderItemList = new ArrayList<>();

        for (BuyItem buyItem : createOrderRequest.getBuyItemList()) {
            Product product = productDao.getProductById(buyItem.getProductId());

            // Calculate total price
            int amount = product.getPrice() * buyItem.getQuantity();
            totalAmount += amount;

            // Convert BuyItem to OrderItem
            OrderItem orderItem = new OrderItem();
            orderItem.setProductId(buyItem.getProductId());
            orderItem.setQuantity(buyItem.getQuantity());
            orderItem.setAmount(amount);

            orderItemList.add(orderItem);
        }

        // Create order
        Integer orderId = orderDao.createOrder(userId, totalAmount);

        orderDao.createOrderItems(orderId, orderItemList);

        return orderId;
    }
}
