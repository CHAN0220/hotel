package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapper.ReceptionMapper;
import com.po.Customer;
import com.po.CustomerCheckIn;
import com.po.Order;
import com.po.Room;
import com.service.ReceptionService;
@Service
@Transactional
public class ReceptionServiceImpl implements ReceptionService {
	@Autowired
	private ReceptionMapper receptionmapper;
	
	public void insertCustomer(Customer customer) {
		receptionmapper.insertCustomer(customer);
	}

	public void deleteCustomer(String customerId) {
		receptionmapper.deleteCustomer(customerId);
	}

	public List<Customer> selectCustomerBycName(String cName) {
		return receptionmapper.selectCustomerBycName(cName);
	}

	public List<Customer> selectCustomer() {
		return receptionmapper.selectCustomer();
	}
	
	public Customer selectCustomerByCustomerId(String customerId) {
		return receptionmapper.selectCustomerByCustomerId(customerId);
	}
	
	public Room selectRoomByRoomId(String roomId) {
		return receptionmapper.selectRoomByRoomId(roomId);
	}

	public void updateRoomState(String roomId, String rState) {
		receptionmapper.updateRoomState(roomId, rState);
	}
	
	public List<Room> findAllRooms(){
		return receptionmapper.selectRoom();
	}
	
	public List<Room> selectSpareRoom(String rState,  String rTypeId){
		return receptionmapper.selectSpareRoom(rState, rTypeId);
	}
	
	public List<Room> selectSpareRoomByrState(String rState){
		return receptionmapper.selectSpareRoomByrState(rState);
	}
	
	public List<Room> selectSpareRoomByrTypeId(String rTypeId){
		return receptionmapper.selectSpareRoomByrTypeId(rTypeId);
	}

	public String selectCustomerCheckInId(String customerId) {
		return receptionmapper.selectCustomerCheckInId(customerId);
	}

	public String selectCustomerCheckInType(String checkInId) {
		return receptionmapper.selectCustomerCheckInType(checkInId);
	}

	public Double selectDiscountByCheckInId(String checkInId) {
		return receptionmapper.selectDiscountByCheckInId(checkInId);
	}

	public void insertOrder(Order order) {
		receptionmapper.insertOrder(order);
	}

	public void insertCustomerCheckIn(CustomerCheckIn customerCheckIn) {
		receptionmapper.insertCustomerCheckIn(customerCheckIn);
	}
}
