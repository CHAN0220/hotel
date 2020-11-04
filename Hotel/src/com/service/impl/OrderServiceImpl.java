package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapper.OrderMapper;
import com.po.Order;
import com.service.OrderService;
@Service
@Transactional
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderMapper orderMapper;
	public List<Order> findAllOrders() {
		return orderMapper.selectOrder();
	}

	public Order selectOrderByOrderId(String orderId) {
		return orderMapper.selectOrderByOrderId(orderId);
	}

}
