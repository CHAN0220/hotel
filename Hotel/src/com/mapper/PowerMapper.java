package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.po.Role;
import com.po.User;

public interface PowerMapper {
	void updateRole(Role role);
	String selectPowerIdByUserId(String userId);
	String selectPowerByPowerId(String powerId);
	List<User> selectUsers();
	void deleteUser(@Param("userId") String userId);
}
