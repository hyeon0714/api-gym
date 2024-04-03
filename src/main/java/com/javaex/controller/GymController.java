package com.javaex.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.GymService;
import com.javaex.util.ListUtil;
import com.javaex.vo.ManagerVo1;

@RestController
public class GymController {
	
	@Autowired
	private GymService gs;
	
	//관리자 멤버 메인
	@GetMapping("/api/gym/manager")
	public List<ManagerVo1> memberList() {
		System.out.println("/gym/manager");
		
		List<ManagerVo1> mlist = gs.exeList();
		
		return mlist;
	}
	
	//관리자 멤버 1명 기본
	@PostMapping("/api/gym/manager/member")
	public Map<String, Object> memberView(@RequestBody int no) {
		System.out.println("member");
		
		System.out.println(no);
		
		return gs.exeMemberView(no);
	}
	
	
	
}
