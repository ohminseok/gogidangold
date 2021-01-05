package com.spring.gogidang.event;

import java.util.ArrayList;




public interface EventService {
	
	public ArrayList<EventVO> getEventlist();
	public EventVO selectEvent(EventVO eventVO);

}
