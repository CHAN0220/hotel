package com.mapper;

import org.apache.ibatis.annotations.Param;

import com.po.Room;
import com.po.User;

public interface RoomMapper {
	void insertRoom(Room room);
	void deleteRoom(@Param("roomId") String roomId);
	Room selectRoomByRoomId(String roomId);
}
