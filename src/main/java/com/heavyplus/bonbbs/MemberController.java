package com.heavyplus.bonbbs;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.heavyplus.dto.MemberDTO;
import com.heavyplus.service.MemberService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

	private final MemberService memberService;

	@GetMapping()
	public String getMemberInfo() {
	    return "member/getMemberInfo";
	}

	@GetMapping(params="act=signUp")
	public String getSignUpView() throws Exception {
		return "member/signUpForm";
	}

	@PostMapping()
	public String insertMember(MemberDTO member) throws Exception {
	    memberService.regist(member);
	    return "redirect:/";
	}

	@PatchMapping()
	public String updateMember(MemberDTO member) throws Exception {
	    memberService.modify(member);
	    return "redirect:/member";
	}

	@DeleteMapping()
	public String deleteMember() throws Exception {
	    return "redirect:/";
	}

}