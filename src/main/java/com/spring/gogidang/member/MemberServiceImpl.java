package com.spring.gogidang.member;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.gogidang.event.EventVO;
import com.spring.gogidang.review.ReviewVO;
import com.spring.gogidang.store.StoreVO;
import com.spring.mapper.MemberMapper;




@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insertMember(MemberVO memberVO) {
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		int res = memberMapper.insertMember(memberVO);
		System.out.println("res = " + res);
		
		return res;
	}
	
	@Override
	public int userCheck(MemberVO memberVO) {
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		int res = memberMapper.userCheck(memberVO);
		
		return res;
	}
	
	@Override
	public ArrayList<MemberVO> getMemberlist() {
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		ArrayList<MemberVO> memberList = new ArrayList<MemberVO>();
		memberList = memberMapper.getMembers();
		
		return memberList;
	}
	
	@Override
	public MemberVO selectMember(MemberVO memberVO) {
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		MemberVO vo = memberMapper.selectMember(memberVO);
		
		return vo;
	}
	
	@Override
	public ArrayList<EventVO> getEventlist() {
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		ArrayList<EventVO> eventList = new ArrayList<EventVO>();
		eventList = memberMapper.getEvents();
		
		return eventList;
	}
	
	@Override
	public ArrayList<StoreVO> getStorelist() {
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		ArrayList<StoreVO> storeList = new ArrayList<StoreVO>();
		storeList = memberMapper.getStores();
		
		return storeList;
	}
	
	@Override
	public ArrayList<ReviewVO> getReviewlist() {
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		ArrayList<ReviewVO> reviewList = new ArrayList<ReviewVO>();
		reviewList = memberMapper.getReviews();
		
		return reviewList;
	}

	
	

}
