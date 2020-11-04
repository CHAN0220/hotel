package com.mapper;

import org.apache.ibatis.annotations.Param;

import com.po.Role;
import com.po.User;

public interface UserMapper {
	User selectUserByUserIdAP(@Param("userId") String userId, @Param("password") String password);
	User selectUserByUserId(@Param("userId") String userId);
	void insertUser(User user);
	void insertRole(String userId);
	void updateUser(User user);
}
