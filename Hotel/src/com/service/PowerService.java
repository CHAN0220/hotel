package com.service;

import java.util.List;

import com.po.Role;
import com.po.User;

public interface PowerService {
	String findPowerIdByUserId(String userId);
	String findPowerByPowerId(String powerId);
	void updateRole(Role role);
	List<User> findAllUsers();
	void deleteUser(String[] userArray);
}
