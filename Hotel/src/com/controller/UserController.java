package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.po.User;
import com.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	//��¼ҳ�棬�����û������ѯ�Ƿ��и��û�
	@RequestMapping(value = "/loginaction", method=RequestMethod.POST)
	public String login(String userId, String password, Model model, HttpSession session) {
		//ͨ���˺ź������ѯ�û�
		User user = userService.findUserByUserIdAP(userId, password);
		if(user != null) {
			//���û�������ӵ�Session
			session.setAttribute("user", user);
			//��ת����ҳ��
			return "/home";
		}
		model.addAttribute("msg","�˺Ż��������");
		return "/login";
	}
	
	//��ʾ������Ϣ
	@RequestMapping(value = "/myinfo", method=RequestMethod.GET)
	public String myinfo() {
		return "/myinfo";
	}
	
	//��ת����ҳ
	@RequestMapping(value = "/home", method=RequestMethod.GET)
	public String tohome() {
		return "/home";
	}
	
	//��ת��ע��ҳ��
	@RequestMapping(value = "/reg", method=RequestMethod.GET)
	public String reg() {
		return "/reg";
	}
	
	//ע��ҳ�棬ע���û�
	@RequestMapping(value = "/regaction", method=RequestMethod.POST)
	public String reg(User user, Model model) {
		//ͨ���˺ź������ѯ�û�
		User user1 = userService.findUserByUserId(user.getUserId());
		if(user1 != null) {
			//���û�������ӵ�Session
			model.addAttribute("msg","�Ѵ��ڴ��˺ţ�");
			//��ת����ҳ��
			return "/reg";
		}
		userService.insertUser(user);
		userService.insertRole(user.getUserId());
		return "login";
	}

	//��ת���޸ĸ�����Ϣҳ��
	@RequestMapping(value = "/myinfoupdate", method=RequestMethod.GET)
	public String toUpdate() {
		return "myinfoupdate";
	}
	
	//�޸ĸ�����Ϣ
	@RequestMapping(value = "/updateUser", method=RequestMethod.POST)
	public String updateUser(User user,HttpSession session) {
		//ͨ���˺ź������ѯ�û�
		userService.updateUser(user);
		session.setAttribute("user",user);
		return "home";
	}
	
	//�˳���¼
	@RequestMapping(value = "/loginout", method=RequestMethod.GET)
	public String outUser(HttpSession session) {
		//ͨ���˺ź������ѯ�û�
		session.removeAttribute("user");
		return "/login";
	}
}

