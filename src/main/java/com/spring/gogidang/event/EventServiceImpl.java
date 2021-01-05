package com.spring.gogidang.event;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mapper.EventMapper;
import com.spring.mapper.MemberMapper;

@Service
public class EventServiceImpl implements EventService {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public ArrayList<EventVO> getEventlist() {
		EventMapper eventMapper = sqlSession.getMapper(EventMapper.class);
		ArrayList<EventVO> eventList = new ArrayList<EventVO>();
		eventList = eventMapper.getEvents();
		
		return eventList;
	}
	
	@Override
	public EventVO selectEvent(EventVO eventVO) {
		EventMapper eventMapper = sqlSession.getMapper(EventMapper.class);
		EventVO vo = eventMapper.selectEvent(eventVO);
		return vo;
	}

}
