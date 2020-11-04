package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.po.Room;
import com.po.User;
import com.service.PowerService;
import com.service.ReceptionService;
import com.service.RoomService;

@Controller

public class RoomController {

	@Autowired
	private PowerService powerService;
	@Autowired
	private RoomService roomService;
	@Autowired
	private ReceptionService receptionService;
	
	@RequestMapping(value = "/roomadd",method=RequestMethod.GET)
	public String roomadd(Model model,HttpSession session) {
		User user = (User)session.getAttribute("user");
		String power = powerService.findPowerIdByUserId(user.getUserId());
		if(power.equals("2")) {
			return "roomadd";
		}
		model.addAttribute("msg","没有权限查询！");
		return "home";
	}

	@RequestMapping(value = "/insertRoom", method=RequestMethod.POST)
	public String insertRoom(Room room, Model model, HttpSession session) {
		// TODO Auto-generated method stub
		Room room1 = roomService.findRoomByRoomId(room.getRoomId());
		if(room1 != null) {
			//警告已存在此房间
			model.addAttribute("msg","房间已经存在！");

			return "roomadd";
		}
		//添加房间
		roomService.insertRoom(room);
		return "redirect:roominfo";
	}
	
	@RequestMapping(value = "/roomdelete",method=RequestMethod.GET)
	public String roomdelete(HttpSession session) {
		List<Room> roomlist = receptionService.findAllRooms();
		session.setAttribute("roomlist", roomlist);
		return "roomdelete";//返回订单
	}
    
	@RequestMapping(value = "/deleteRoom",method=RequestMethod.POST)
	public String deleteRoom(String[] roomArray) {
		roomService.deleteRoom(roomArray);
		return "redirect:roomdelete";
	}

	@RequestMapping(value = "/roomState1")
	public String roomState(String rState, HttpSession session) {
		List<Room> roomlist = receptionService.selectSpareRoomByrState(rState);
		session.setAttribute("roomlist", roomlist);
		return "roomdelete";//返回订单
	}
	
	@RequestMapping(value = "/selectRoomByInfo1")
	public String ShowSpareRoom(String rTypeId, String rState, Model model) {
		if(rTypeId.equals("0") && rState.equals("0")) {
			return "redirect:roomdelete";
		}
		if(rTypeId.equals("0") && !rState.equals("0")) {
			return "forward:roomState1";
		}
		if(rState.equals("0") && !rTypeId.equals("0")) {
			List<Room> roomlist = receptionService.selectSpareRoom(null,rTypeId);
			model.addAttribute("roomlist", roomlist);
		}
		else {
			List<Room> roomlist = receptionService.selectSpareRoom(rState, rTypeId);
			model.addAttribute("roomlist", roomlist);
		}
		return "roomdelete";//返回订单
	}
}
