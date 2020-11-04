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
	
	//登录页面，根据用户密码查询是否有该用户
	@RequestMapping(value = "/loginaction", method=RequestMethod.POST)
	public String login(String userId, String password, Model model, HttpSession session) {
		//通过账号和密码查询用户
		User user = userService.findUserByUserIdAP(userId, password);
		if(user != null) {
			//将用户对象添加到Session
			session.setAttribute("user", user);
			//跳转到主页面
			return "/home";
		}
		model.addAttribute("msg","账号或密码错误！");
		return "/login";
	}
	
	//显示个人信息
	@RequestMapping(value = "/myinfo", method=RequestMethod.GET)
	public String myinfo() {
		return "/myinfo";
	}
	
	//跳转到首页
	@RequestMapping(value = "/home", method=RequestMethod.GET)
	public String tohome() {
		return "/home";
	}
	
	//跳转到注册页面
	@RequestMapping(value = "/reg", method=RequestMethod.GET)
	public String reg() {
		return "/reg";
	}
	
	//注册页面，注册用户
	@RequestMapping(value = "/regaction", method=RequestMethod.POST)
	public String reg(User user, Model model) {
		//通过账号和密码查询用户
		User user1 = userService.findUserByUserId(user.getUserId());
		if(user1 != null) {
			//将用户对象添加到Session
			model.addAttribute("msg","已存在此账号！");
			//跳转到主页面
			return "/reg";
		}
		userService.insertUser(user);
		userService.insertRole(user.getUserId());
		return "login";
	}

	//跳转到修改个人信息页面
	@RequestMapping(value = "/myinfoupdate", method=RequestMethod.GET)
	public String toUpdate() {
		return "myinfoupdate";
	}
	
	//修改个人信息
	@RequestMapping(value = "/updateUser", method=RequestMethod.POST)
	public String updateUser(User user,HttpSession session) {
		//通过账号和密码查询用户
		userService.updateUser(user);
		session.setAttribute("user",user);
		return "home";
	}
	
	//退出登录
	@RequestMapping(value = "/loginout", method=RequestMethod.GET)
	public String outUser(HttpSession session) {
		//通过账号和密码查询用户
		session.removeAttribute("user");
		return "/login";
	}
}

