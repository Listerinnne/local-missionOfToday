package com.ssafy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssafy.mvc.dto.User;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

	@GetMapping("/login")
	public String gotoLoginform(Model model) {
		model.addAttribute("msg2","로그인페이지로 이동함");
		return "/user/loginform";
	}
	
//	//방법1
//	@PostMapping("/login")
//	public String doLogin(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) {
//		
//		System.out.println(id);
//		System.out.println(pw);
//		model.addAttribute("msg", "유저컨트롤러에서 왔다");
//		return "hello";
//	}
	
	//방법2
	@PostMapping("/login")
	public String doLogin(@ModelAttribute User user, HttpSession session) {

		System.out.println(user);
		session.setAttribute("loginUser", user.getId());
		return "redirect:hello";
	}
	
	
	@GetMapping("/logout")
	public String doLogout(HttpSession session) {
		session.removeAttribute("loginUser");
		
		return "redirect:/";
	}
	
	
	
}
