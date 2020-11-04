package com.service;

import java.util.List;

import com.po.Order;

public interface OrderService {
	List<Order> findAllOrders();
	Order selectOrderByOrderId(String orderId);
}
