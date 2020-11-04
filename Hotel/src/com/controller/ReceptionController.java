package com.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.orderHandle.OrderHandle;
import com.po.Customer;
import com.po.CustomerCheckIn;
import com.po.Order;
import com.po.Room;
import com.service.ReceptionService;

@Controller

public class ReceptionController {
	@Autowired
	private ReceptionService receptionService;
	
	@RequestMapping(value = "/insertCustomer", method=RequestMethod.POST)
	public String insertCustomer(Customer customer, String checkInId, HttpSession session) {
		String roomId = (String)session.getAttribute("roomId");
		Date checkInTime = new Date();
		customer.setRoomId(roomId);
		customer.setCheckInTime(checkInTime);
		receptionService.insertCustomer(customer);
		CustomerCheckIn customerCheckIn = new CustomerCheckIn();
		customerCheckIn.setCustomerId(customer.getCustomerId());
		customerCheckIn.setCheckInId(checkInId);
		receptionService.updateRoomState(roomId, "已住");
		session.removeAttribute("roomId");
		return "";//跳转到主页面
	}
	
	
	
	@RequestMapping(value = "/ConfirmRoom", method=RequestMethod.POST)
	public String ConfirmRoom(String roomId, HttpSession session) {
		session.setAttribute("roomId", roomId);
		return "";//返回添加客人页面
	}
	
	@RequestMapping(value = "/CheckOut", method=RequestMethod.POST)
	public String CheckOut(String customerId) {
		Customer customer = receptionService.selectCustomerByCustomerId(customerId);
		receptionService.deleteCustomer(customerId);
		receptionService.updateRoomState(customer.getRoomId(), "空闲");
		double roomprice = receptionService.selectRoomByRoomId(customer.getRoomId()).getPrice();
		String checkInId = receptionService.selectCustomerCheckInId(customerId);
		Double discount = receptionService.selectDiscountByCheckInId(checkInId);
		OrderHandle orderHandle = new OrderHandle();
		Order order = orderHandle.orderHandle(customer, discount, roomprice);
		receptionService.insertOrder(order);
		return "";//返回查询所有订单
	}
	
	@RequestMapping(value = "/roominfo")
	public String roominfo(HttpSession session) {
		List<Room> roomlist = receptionService.findAllRooms();
		session.setAttribute("roomlist", roomlist);
		return "roominfo";//返回订单
	}
	
	@RequestMapping(value = "/roomState")
	public String roomState(String rState, HttpSession session) {
		List<Room> roomlist = receptionService.selectSpareRoomByrState(rState);
		session.setAttribute("roomlist", roomlist);
		return "roominfo";//返回订单
	}
	
	@RequestMapping(value = "/selectRoomByInfo")
	public String ShowSpareRoom(String rTypeId, String rState, Model model) {
		if(rTypeId.equals("0") && rState.equals("0")) {
			return "redirect:roominfo";
		}
		if(rTypeId.equals("0") && !rState.equals("0")) {
			return "forward:roomState";
		}
		if(rState.equals("0") && !rTypeId.equals("0")) {
			List<Room> roomlist = receptionService.selectSpareRoom(null,rTypeId);
			model.addAttribute("roomlist", roomlist);
		}
		else {
			List<Room> roomlist = receptionService.selectSpareRoom(rState, rTypeId);
			model.addAttribute("roomlist", roomlist);
		}
		return "roominfo";//返回订单
	}

	@RequestMapping(value = "/roomcheck")
	public String roomcheck(HttpSession session) {
		List<Room> roomlist = receptionService.findAllRooms();
		session.setAttribute("roomlist", roomlist);
		return "roomcheck";
	}
	
	@RequestMapping(value = "/roomState2")
	public String roomState2(String rState, HttpSession session) {
		List<Room> roomlist = receptionService.selectSpareRoomByrState(rState);
		session.setAttribute("roomlist", roomlist);
		return "roomcheck";//返回订单
	}
	
	@RequestMapping(value = "/selectRoomByInfo2")
	public String ShowSpareRoom2(String rTypeId, String rState, Model model) {
		if(rTypeId.equals("0") && rState.equals("0")) {
			return "redirect:roomcheck";
		}
		if(rTypeId.equals("0") && !rState.equals("0")) {
			return "forward:roomState2";
		}
		if(rState.equals("0") && !rTypeId.equals("0")) {
			List<Room> roomlist = receptionService.selectSpareRoom(null,rTypeId);
			model.addAttribute("roomlist", roomlist);
		}
		else {
			List<Room> roomlist = receptionService.selectSpareRoom(rState, rTypeId);
			model.addAttribute("roomlist", roomlist);
		}
		return "roomcheck";//返回订单
	}
	
	
}
