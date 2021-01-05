package com.spring.mapper;

import java.util.ArrayList;

import com.spring.gogidang.event.EventVO;



public interface EventMapper {

	public ArrayList<EventVO> getEvents();
	public EventVO selectEvent(EventVO event);
}
