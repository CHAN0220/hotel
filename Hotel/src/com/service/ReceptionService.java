package com.service;

import java.util.List;

import com.po.Customer;
import com.po.CustomerCheckIn;
import com.po.Order;
import com.po.Room;

public interface ReceptionService {
	void insertCustomer(Customer customer);
	void deleteCustomer(String customerId);
	List<Customer> selectCustomerBycName(String cName);
	List<Customer> selectCustomer();
	Customer selectCustomerByCustomerId(String customerId);
	Room selectRoomByRoomId(String roomId);
	void updateRoomState(String roomId, String rState);
	List<Room> findAllRooms();
	List<Room> selectSpareRoom(String rState, String rTypeId);
	List<Room> selectSpareRoomByrState(String rState);
	List<Room> selectSpareRoomByrTypeId(String rTypeId);
	String selectCustomerCheckInId(String customerId);
	String selectCustomerCheckInType(String checkInId);
	Double selectDiscountByCheckInId(String checkInId);
	void insertOrder(Order order);
	void insertCustomerCheckIn(CustomerCheckIn customerCheckIn);
}
