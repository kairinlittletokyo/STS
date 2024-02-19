package com.icia.semiproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/semiproject/logintest")
    public String showLoginPage() {
        return "logintest"; // login.jsp 또는 login.html과 같은 뷰 페이지 이름을 반환합니다.
        
     
 
    }
}
