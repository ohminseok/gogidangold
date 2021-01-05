package com.spring.mapper;

import java.util.ArrayList;

import com.spring.gogidang.event.EventVO;
import com.spring.gogidang.member.MemberVO;
import com.spring.gogidang.review.ReviewVO;
import com.spring.gogidang.store.StoreVO;


public interface MemberMapper {
	
	public int insertMember(MemberVO member);
	public int userCheck(MemberVO member);
	public ArrayList<MemberVO> getMembers();
	public MemberVO selectMember(MemberVO memberVO);
	public ArrayList<EventVO> getEvents();
	public ArrayList<StoreVO> getStores();
	public ArrayList<ReviewVO> getReviews();
}
