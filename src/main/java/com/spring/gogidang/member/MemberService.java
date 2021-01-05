package com.spring.gogidang.member;

import java.util.ArrayList;

import com.spring.gogidang.event.EventVO;
import com.spring.gogidang.review.ReviewVO;
import com.spring.gogidang.store.StoreVO;


public interface MemberService {

	public int insertMember(MemberVO memberVO);
	public int userCheck(MemberVO memberVO);
	public ArrayList<MemberVO> getMemberlist();
	public MemberVO selectMember(MemberVO memberVO);
	public ArrayList<EventVO> getEventlist();
	public ArrayList<StoreVO> getStorelist();
	public ArrayList<ReviewVO> getReviewlist();
}
