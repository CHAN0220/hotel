package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapper.PowerMapper;
import com.po.Role;
import com.po.User;
import com.service.PowerService;

@Service
@Transactional

public class PowerServiceImpl implements PowerService{
	@Autowired
	private PowerMapper powerMapper;
	
	public String findPowerIdByUserId(String userId) {
		return powerMapper.selectPowerIdByUserId(userId);
	}
	public String findPowerByPowerId(String powerId) {
		return powerMapper.selectPowerByPowerId(powerId);
	}
	public void updateRole(Role role) {
		powerMapper.updateRole(role);
	}
	public List<User> findAllUsers(){
		return powerMapper.selectUsers();
	}
	public void deleteUser(String[] userArray) {
		for (int i = 0; i < userArray.length; i ++){
			powerMapper.deleteUser(userArray[i]);
		}

	}
}
