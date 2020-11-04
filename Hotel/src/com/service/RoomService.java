package com.service;

import com.po.Room;

public interface RoomService {
	void insertRoom(Room room);
	void deleteRoom(String[] roomArray);
	Room findRoomByRoomId(String roomId);
}
