package com.spring.gogidang.event;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.spring.gogidang.member.MemberService;

@Controller
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@RequestMapping("/eventpage.ev") 
	public String eventPage(Model model) throws Exception { 
		ArrayList<EventVO> event_list = eventService.getEventlist();
		model.addAttribute("event_list", event_list);
		return "event/eventpage";
	}
	
	@RequestMapping("/eventinfo.ev") 
	public String selectEvent(EventVO eventVO, Model model) throws Exception { 
		EventVO vo = eventService.selectEvent(eventVO);
		model.addAttribute("eventVO",vo);
		return "event/eventpage_info";
	}

}
