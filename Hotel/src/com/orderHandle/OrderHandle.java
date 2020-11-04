package com.orderHandle;

import java.util.Date;
import java.util.Random;

import com.po.Customer;
import com.po.Order;

public class OrderHandle {
	public Order orderHandle(Customer customer, double discount, double price) {
		Order order = new Order();
		Random random = new Random();
		String num = "" + random.nextInt(100);
		TimeHandle timehandle = new TimeHandle();
		Date checkInTime = customer.getCheckInTime();
		Date checkOutTime = new Date();
		int days = timehandle.timedays(checkInTime, checkOutTime);
		order.setOrderId(num);
		order.setOrderIn(checkInTime);
		order.setOrderOut(checkOutTime);
		order.setRoomId(customer.getRoomId());
		order.setOrderCost(days*price);
		order.setOrderRealCost(days*price*discount);
		return order;
	}
}
