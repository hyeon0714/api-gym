package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.AttendVo;
import com.javaex.vo.GeneralVo;
import com.javaex.vo.LessonVo;
import com.javaex.vo.ManagerVo1;
import com.javaex.vo.MemberVo;
import com.javaex.vo.PtVo;

@Repository
public class GymDao {

	@Autowired
	private SqlSession sqlSession;
	
	//관리자 멤버 리스트
	public List<ManagerVo1> list1() {
		
		List<ManagerVo1> memberList = sqlSession.selectList("manager.membermainlist");
		
		System.out.println(memberList);
		
		return memberList;
	}
	
	//서버의 멤버값
	public MemberVo memberS(int no) {
		
		MemberVo mv = sqlSession.selectOne("manager.memberS", no);
		System.out.println(mv);
		return mv;
	}
	
	//이용권 최근거
	public GeneralVo generalS(int no) {
		
		return sqlSession.selectOne("manager.generalS", no);
	}
	
	//pt횟수
	public PtVo ptS(int no) {
		
		return sqlSession.selectOne("manager.ptS", no);
	}
	
	//출결기록
	public List<AttendVo> attendS(int no) {
		
		return sqlSession.selectList("manager.attendS", sqlSession);
	}
	
	//pt이용기록
	public List<LessonVo> lessonS(int no) {
		
		return sqlSession.selectList("manager.lessonS", no);
	}
	
	//결제기록
	public List<GeneralVo> generalSS(int no) {
		
		return sqlSession.selectList("manager.generalSS", no);
	}
}
