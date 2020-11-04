package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.po.Order;
import com.service.OrderService;

@Controller
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value = "/historyOrder", method=RequestMethod.GET)
	public String historyOrder(HttpSession session) {
		List<Order> orderlist = orderService.findAllOrders();
		session.setAttribute("orderlist", orderlist);
		return "historyOrder";
	}
	
	@RequestMapping(value = "/findOrderByOrderId", method=RequestMethod.POST)
	public String showOrder(String orderId, HttpSession session) {
		Order order = orderService.selectOrderByOrderId(orderId);
		session.setAttribute("order", order);
		return "";
	}
}
