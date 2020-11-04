package com.po;

public class Room {
	private String roomId;
	private String rState;
	private String rTypeId;
	private double price;
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getrState() {
		return rState;
	}
	public void setrState(String rState) {
		this.rState = rState;
	}
	public String getrTypeId() {
		return rTypeId;
	}
	public void setrTypeId(String rTypeId) {
		this.rTypeId = rTypeId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
