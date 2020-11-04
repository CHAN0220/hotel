package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapper.RoomMapper;
import com.po.Room;
import com.service.RoomService;

@Service
@Transactional

public class RoomServiceImpl implements RoomService {
	@Autowired
	
	private RoomMapper roomMapper;
	
	public void insertRoom(Room room) {
		// TODO Auto-generated method stub
		roomMapper.insertRoom(room);
	}

	@Override
	public void deleteRoom(String[] roomArray) {
		// TODO Auto-generated method stub
		for (int i = 0; i < roomArray.length; i ++){
			roomMapper.deleteRoom(roomArray[i]);
		}
	}

	@Override
	public Room findRoomByRoomId(String roomId) {
		// TODO Auto-generated method stub
		return roomMapper.selectRoomByRoomId(roomId);
	}

}
