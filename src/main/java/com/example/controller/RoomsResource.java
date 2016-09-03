package com.example.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rooms")
public class RoomsResource {

	private static String[] rooms = { "aaa", "bbb", "ccc" };

	@RequestMapping(method = RequestMethod.GET)
	public String[] getRooms() {
		return rooms;
	}

	@RequestMapping(value = "/{roomId}", method = RequestMethod.GET)
	public String getRoom(@PathVariable("roomId") Integer roomId) {
		if (roomId < 0 || roomId >= rooms.length) {
			return null;
		}
		return rooms[roomId];
	}
}
