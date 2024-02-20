package com.icia.semiproject;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.icia.semiproject.service.UserService;

@Controller
public class LoginController {
	
	

	@GetMapping("/logintest")
	public String showLoginPage() {
		return "logintest"; // login.jsp 또는 login.html과 같은 뷰 페이지 이름을 반환합니다.
	}

	private UserService userService;

	@Resource
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@PostMapping("/home")
	public String processLogin(@RequestParam String username, @RequestParam String password) {
	    boolean loginSuccess = userService.authenticate(username, password);
	    if(loginSuccess) {
	        // 로그인 성공 시 홈 페이지로 이동
	        return "/home";
	    } else {
	        // 로그인 실패 시 로그인 페이지로 이동하고 에러 메시지 전달
	        return "redirect:/login?error"; 
	    }
	}
}
