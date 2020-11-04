package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.po.Role;
import com.po.User;
import com.service.PowerService;


@Controller
public class PowerController {
	@Autowired
	private PowerService powerService;
	
	//��ѯȨ��
	@RequestMapping(value = "/powermanager")
	public String powermanager(String userId, HttpSession session) {
		//ͨ���˺ź������ѯ�û�
		String powerId = powerService.findPowerIdByUserId(userId);
		String power = powerService.findPowerByPowerId(powerId);
		session.setAttribute("power", power);
		return "powermanager";
	}
	
	@RequestMapping(value = "/updatePower", method=RequestMethod.POST)
	public String updateRole(Role role) {
		//ͨ���˺ź������ѯ�û�
		powerService.updateRole(role);
		return "";
	}
	
	@RequestMapping(value = "/findAllUsers",method=RequestMethod.GET)
	public String findAllUsers(HttpSession session, Model model) {
		//ͨ���˺ź������ѯ�û�
		User user = (User)session.getAttribute("user");
		String power = powerService.findPowerIdByUserId(user.getUserId());
		if(power.equals("2")) {
			List<User> users = powerService.findAllUsers();
			session.setAttribute("users", users);
			return "userlist";
		}
		model.addAttribute("msg","û��Ȩ�޲�ѯ��");
		return "home";
	}
	
	//ɾ���û�
	@RequestMapping(value = "/deleteUser", method=RequestMethod.POST)
	public String deleteUser(String[] userArray) {
		//ͨ���˺ź������ѯ�û�
		powerService.deleteUser(userArray);
		return "redirect:findAllUsers";
	}
	
}
