package hellow.hellowspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import hellow.hellowspring.repository.MemberRepository;
import hellow.hellowspring.service.MemberService;

@Controller
public class MemberController {
	//@Autowired private MemberService;  필드 주입
	private final MemberService memberService;

	@Autowired
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}

	//setter 주입
	// @Autowired
	// public void setMemberService(MemberService memberService) {
	// 	this.memberService = memberService;
	// }

}
