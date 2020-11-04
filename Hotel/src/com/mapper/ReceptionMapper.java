package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.po.Customer;
import com.po.CustomerCheckIn;
import com.po.Order;
import com.po.Room;

public interface ReceptionMapper {
	void insertCustomer(Customer customer);
	void deleteCustomer(@Param("customerId") String customerId);
	List<Customer> selectCustomerBycName(@Param("cName")String cName);
	Room selectRoomByRoomId(@Param("roomId")String roomId);
	void updateRoomState(@Param("roomId") String roomId, @Param("rState") String rState);
	List<Room> selectRoom();
	List<Room> selectSpareRoom(@Param("rState") String rState, @Param("rTypeId") String rTypeId);
	List<Room> selectSpareRoomByrState(@Param("rState") String rState);
	List<Room> selectSpareRoomByrTypeId(@Param("rTypeId") String rTypeId);
	Customer  selectCustomerByCustomerId(@Param("customerId")String customerId);
	List<Customer> selectCustomer();
	String selectCustomerCheckInId(String customerId);
	String selectCustomerCheckInType(String checkInId);
	Double selectDiscountByCheckInId(String checkInId);
	void insertOrder(Order order);
	void insertCustomerCheckIn(CustomerCheckIn customerCheckIn);
}
