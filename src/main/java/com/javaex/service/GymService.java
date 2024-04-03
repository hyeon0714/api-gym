package com.javaex.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.GymDao;
import com.javaex.vo.AttendVo;
import com.javaex.vo.GeneralVo;
import com.javaex.vo.LessonVo;
import com.javaex.vo.ManagerVo1;
import com.javaex.vo.MemberVo;
import com.javaex.vo.PtVo;

@Service
public class GymService {
	
	@Autowired
	private GymDao gd;
	
	//관리자 멤버 리스트
	public List<ManagerVo1> exeList() {
		
		return gd.list1();
	}
	
	//관리자 멤버 정보
	public Map<String, Object> exeMemberView(int no) {
		
		//서버의 멤버값
		MemberVo mv = gd.memberS(no);
		
		//이용권 최근거
		GeneralVo gv = gd.generalS(no);
		System.out.println(gv);
		
		//pt 횟수
		PtVo pv = gd.ptS(no);
		System.out.println(pv);
		
		//출결기록
		List<AttendVo> attendList = gd.attendS(no);
		System.out.println(attendList);
		
		//pt이용기록
		List<LessonVo> lessonList = gd.lessonS(no);
		System.out.println(lessonList);
		
		//결제기록
		List<GeneralVo> generalList = gd.generalSS(no);
		System.out.println(generalList);
		
		Map<String, Object> memberMap = new HashMap<String, Object>();
		memberMap.put("mv", mv);
		memberMap.put("gv", gv);
		memberMap.put("pv", pv);
		memberMap.put("attendList", attendList);
		memberMap.put("lessonList", lessonList);
		memberMap.put("generalList", generalList);
		
		System.out.println(memberMap);
		
		return memberMap;
		
	}
}
