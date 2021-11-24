package com.mycompany.testpractice.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mycompany.testpractice.member.model.service.MemberService;
import com.mycompany.testpractice.member.model.vo.Member;

@Controller
@SessionAttributes("msg")
// session 처럼 동작함. httpSession 만큼 scope가 넓지 않음. model 즉, request의 scope 만큼임.
// F5 중복실행 되지 않음. 1번 전달되고 다시 읽기가 되지 않음.
public class MemberController{
	@Autowired
	private MemberService memberService;
	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String goIndex(@RequestParam String msg, Model model) {
//		model.addAttribute("msg", msg);
//		System.out.println("msg : " + msg);
//		return "index";
//	}
	
	@RequestMapping(value="signUp", method=RequestMethod.POST)
	public String signUp(Member m
//						, RedirectAttributes ra
						, Model model
						) {
		int result=0;
		try {
			result=memberService.signUp(m);
			if(result == 1) {
//				ra.addAttribute("msg", "회원가입 성공");
				model.addAttribute("msg", "회원가입 성공");
			} else if (result == 0) {
//				ra.addAttribute("msg", "회원가입 실패");
				model.addAttribute("msg", "회원가입 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
//			ra.addAttribute("msg", "회원가입 과정에서 오류 발생");
			model.addAttribute("msg", "회원가입 과정에서 오류 발생");
		}
		System.out.println("MEMBER : " + m);
		return "redirect:/";
	}
	
}
