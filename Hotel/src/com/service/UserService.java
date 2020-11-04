package com.service;

import com.po.Role;
import com.po.User;

public interface UserService {
	User findUserByUserIdAP(String userId, String password);
	User findUserByUserId(String userId);
	void insertUser(User user);
	void insertRole(String userId);
	void updateUser(User user);
}
