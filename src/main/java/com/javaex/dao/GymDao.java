package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.MemberVo;

@Repository
public class GymDao {

	@Autowired
	private SqlSession sqlSession;
	
	//id 중복체크
	public void Check(String id) {
		
		System.out.println(id);
		//쿼리문 넣어서 진행하기
		int a = sqlSession.selectOne("member.idCheck", id);
		
		System.out.println(a);
	}
	
	//회원가입
	public void join(MemberVo mv) {
		
		//쿼리문 넣기
	}
}
