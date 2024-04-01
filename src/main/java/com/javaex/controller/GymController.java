package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.GymService;
import com.javaex.service.TrainerService;
import com.javaex.util.JsonResult;
import com.javaex.util.JwtUtil;
import com.javaex.vo.MemberVo;
import com.javaex.vo.TrainerVo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class GymController {
	
	@Autowired
	private GymService gs;
	
	//아이디 중복체크
	@PostMapping("/api/membercheck")
	public void idCheck(@RequestBody MemberVo mv) {
		System.out.println("idCheck");
		System.out.println(mv);
		String id = mv.getId();
		System.out.println(id);
		
		gs.exeCheck(id);
	}
	
	//회원가입
	@PostMapping("/api/memberjoin")
	public void join(@RequestBody MemberVo mv) {
		System.out.println(mv);
		
		gs.exeJoin(mv);
	}
	
	
	/////////////////////////////////
	//트레이너
	@Autowired
	private TrainerService trainerService;


	// 로그인
	@PostMapping("/api/trainer/login")
	public JsonResult login(@RequestBody TrainerVo trainerVo, HttpServletResponse response) {
		System.out.println("TrainerController.login()");
		
		System.out.println(trainerVo);
		TrainerVo authUser = trainerService.exeLogin(trainerVo);
		System.out.println(authUser);

		if(authUser != null) {
			//토큰을 발급해서 응답문서의 헤더에 실어보낸다
			JwtUtil.createTokenAndSetHeader(response, ""+authUser.getNo());
			return JsonResult.success(authUser);
		}else {
			return JsonResult.fail("로그인 실패");
		}
		
	}
	
	//로그인 성공(강사 정보창)
	@GetMapping("/api/trainer/trainermain")
	public JsonResult tranermain(HttpServletRequest request) {
		System.out.println("TrainerController.tranermain()");
		
		int no = JwtUtil.getNoFromHeader(request);
		
		TrainerVo trainerVo = trainerService.exeLoginSeccess(no);
		System.out.println(trainerVo);
		
		return JsonResult.success(trainerVo);
	}
}
