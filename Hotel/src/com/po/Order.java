package com.po;

import java.util.Date;

public class Order {
	private String orderId;
	private String roomId;
	private Date orderIn;
	private Date orderOut;
	private double orderCost;
	private double orderRealCost;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public double getOrderCost() {
		return orderCost;
	}
	public void setOrderCost(double orderCost) {
		this.orderCost = orderCost;
	}
	public double getOrderRealCost() {
		return orderRealCost;
	}
	public void setOrderRealCost(double orderRealCost) {
		this.orderRealCost = orderRealCost;
	}
	public Date getOrderIn() {
		return orderIn;
	}
	public void setOrderIn(Date orderIn) {
		this.orderIn = orderIn;
	}
	public Date getOrderOut() {
		return orderOut;
	}
	public void setOrderOut(Date orderOut) {
		this.orderOut = orderOut;
	}
	
	
}
