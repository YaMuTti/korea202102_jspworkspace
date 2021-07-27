package com.koreait.shoppingmall.controller.rest.study;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.koreait.shoppingmall.domain.Member;

//RESTful 요청을 처라히가 위한 연습용 컨트롤러
@Controller
public class MemberController {
	
	//멤버 목록에 대한 요청 처리
	@GetMapping("/member")
	@ResponseBody //이 어노테이션을 명시하면, ViewResolver에 의해 jsp매핑이 일어나지 않고, 반환된 데이터 자체를 응답정보로 사용하게 됨.
	public List<Member> getList() {
		//제이슨 객체 List<Member>를 자동으로 Json으로 변환하여 응답데이터로 전송...
		//String화 시킴...(외부 라이브러리 의존 Gson.class..) - 불편함. 스프링에서는 자바 객체를 json으로 자동변환해주는 컨버터를 지원함...
		//우리는 이 컨버터는 spring빈 설정파일에 이미 등록해놓았다..
		Member m1 = new Member();
		m1.setMember_id(1);
		m1.setUser_id("scott");
		m1.setPass("0000");
		m1.setName("스캇");
		
		Member m2 = new Member();
		m2.setMember_id(2);
		m2.setUser_id("adams");
		m2.setPass("2222");
		m2.setName("아담스");
		
		List<Member> list=new ArrayList<Member>();
		list.add(m1);
		list.add(m2);
		
		return list;
	}
}