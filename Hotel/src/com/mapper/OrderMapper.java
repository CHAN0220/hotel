package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.po.Order;

public interface OrderMapper {
	List<Order> selectOrder();
	Order selectOrderByOrderId(@Param("orderId") String orderId);
}
