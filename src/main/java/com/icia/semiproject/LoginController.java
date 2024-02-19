package com.icia.semiproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/logintest")
    public String showLoginPage() {
        return "logintest"; //
    }

    @PostMapping("/login")
    public String login() {
        // 여기에 로그인 처리 로직을 작성합니다.
        // 로그인에 성공하면 메인 페이지로 리다이렉트합니다.
        return "redirect:/main"; // 메인 페이지 경로로 리다이렉트합니다.
    }
}