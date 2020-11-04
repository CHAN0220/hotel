package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import com.mapper.UserMapper;
import com.po.User;
import com.service.UserService;

@Service
@Transactional

public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	
	public User findUserByUserIdAP(String userId, String password){
		return userMapper.selectUserByUserIdAP(userId, password);
	}
	public User findUserByUserId(String userId){
		return userMapper.selectUserByUserId(userId);
	}
	public void insertUser(User user) {
		userMapper.insertUser(user);
	}
	public void insertRole(String userId) {
		userMapper.insertRole(userId);
	}
	public void updateUser(User user) {
		userMapper.updateUser(user);
	}
}
