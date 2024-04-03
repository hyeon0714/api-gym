package com.javaex.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.GymService;
import com.javaex.util.ListUtil;

@RestController
public class GymController {
	
	@Autowired
	private GymService gs;
	
	//관리자 멤버 메인
	@PostMapping("/api/gym/manager")
	public Map<String, Object> memberList(@RequestBody ListUtil util ) {
		System.out.println("/gym/manager");
		
		System.out.println(util);
		
		Map<String, Object> map = gs.exeList(util);
		
		return map;
	}
	
	//관리자 멤버 1명 기본
	@PostMapping("/api/gym/manager/member")
	public Map<String, Object> memberView(@RequestBody int no) {
		System.out.println("member");
		
		System.out.println(no);
		
		return gs.exeMemberView(no);
	}
	
	
	
}
