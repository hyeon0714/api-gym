package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.GymService;
import com.javaex.vo.MemberVo;

@RestController
public class GymController {
	
	@Autowired
	private GymService gs;
	
	//아이디 중복체크
	@PostMapping("/api/membercheck")
	public void idCheck(@RequestBody MemberVo mv) {
		System.out.println("idCheck");
		System.out.println(mv);
		String id = mv.getName();
		
		gs.exeCheck(id);
	}
	
	//회원가입
	@PostMapping("/api/memberjoin")
	public void join(@RequestBody MemberVo mv) {
		System.out.println(mv);
		
		gs.exeJoin(mv);
	}
}
