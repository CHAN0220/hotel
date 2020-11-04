package com.po;

import java.util.Date;

public class Customer {
	private String customerId;
	private String cName;
	private String cSex;
	private String cIDCard;
	private String cTel;
	private Date checkInTime;
	private double cDeposit;
	private String roomId;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcSex() {
		return cSex;
	}
	public void setcSex(String cSex) {
		this.cSex = cSex;
	}
	public String getcIDCard() {
		return cIDCard;
	}
	public void setcIDCard(String cIDCard) {
		this.cIDCard = cIDCard;
	}
	public String getcTel() {
		return cTel;
	}
	public void setcTel(String cTel) {
		this.cTel = cTel;
	}
	public double getcDeposit() {
		return cDeposit;
	}
	public void setcDeposit(double cDeposit) {
		this.cDeposit = cDeposit;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public Date getCheckInTime() {
		return checkInTime;
	}
	public void setCheckInTime(Date checkInTime) {
		this.checkInTime = checkInTime;
	}
	
	
	
}
