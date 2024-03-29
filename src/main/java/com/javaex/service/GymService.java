package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.GymDao;
import com.javaex.vo.MemberVo;

@Service
public class GymService {
	
	@Autowired
	private GymDao gd;
	
	//id 중복체크용
	public void exeCheck(String id) {
		
		gd.Check(id);
	}
	
	//회원가입용
	public void exeJoin(MemberVo mv) {
		
		gd.join(mv);
	}
}
