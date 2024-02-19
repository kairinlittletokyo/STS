package com.icia.semiproject;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 로그인 페이지 HTML 출력
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().println("<!DOCTYPE html>");
        response.getWriter().println("<html>");
        response.getWriter().println("<head>");
        response.getWriter().println("<meta charset=\"UTF-8\">");
        response.getWriter().println("<title>Login Page</title>");
        response.getWriter().println("<style>");
        response.getWriter().println("body {");
        response.getWriter().println("    background-color: #FFDEDE;"); // 배경색 설정
        response.getWriter().println("    margin: 0;");
        response.getWriter().println("    padding: 0;");
        response.getWriter().println("    font-family: Arial, sans-serif;");
        response.getWriter().println("    display: flex;");
        response.getWriter().println("    flex-direction: column;"); // 컨테이너의 주축 방향을 세로로 변경
        response.getWriter().println("    align-items: center;");
        response.getWriter().println("    justify-content: center;"); // 화면 수직 중앙 정렬
        response.getWriter().println("    height: 100vh;");
        response.getWriter().println("}");
        response.getWriter().println(".login-container {");
        response.getWriter().println("    text-align: center;"); // 로그인 폼 가운데 정렬
        response.getWriter().println("}");
        response.getWriter().println(".login-form input[type=\"text\"],");
        response.getWriter().println(".login-form input[type=\"password\"],");
        response.getWriter().println(".login-form input[type=\"submit\"] {");
        response.getWriter().println("    width: 314px;");
        response.getWriter().println("    height: 53px;");
        response.getWriter().println("    margin-bottom: 15px;");
        response.getWriter().println("    border: 1px solid #ccc;");
        response.getWriter().println("    border-radius: 5px;");
        response.getWriter().println("    padding: 10px;");
        response.getWriter().println("    box-sizing: border-box;");
        response.getWriter().println("}");
        response.getWriter().println(".login-form input[type=\"submit\"] {");
        response.getWriter().println("    background-color: #4CAF50;"); // 로그인 버튼 색상
        response.getWriter().println("    color: white;");
        response.getWriter().println("    font-weight: bold;");
        response.getWriter().println("    cursor: pointer;");
        response.getWriter().println("}");
        response.getWriter().println("</style>");
        response.getWriter().println("</head>");
        response.getWriter().println("<body>");
        
        // 로고 추가
        response.getWriter().println("<img src=\"resources/images/2.png\" alt=\"이미지가 로드되지 않았습니다.\" width=\"70\" height=\"80\"margin-bottom: 60px;>");
        // 문구 추가
        response.getWriter().println("<h1 style=\"text-align: center; margin-bottom: 120px;\">펑크난 자리, 검증된 인원이 채워드립니다</h1>");
        
        // 로그인 폼
        response.getWriter().println("<div class=\"login-container\">");
        response.getWriter().println("<form action=\"/login\" method=\"post\" class=\"login-form\">");
        response.getWriter().println("    <input type=\"text\" name=\"username\" placeholder=\"아이디를 입력해주세요.\"><br>");
        response.getWriter().println("    <input type=\"password\" name=\"password\" placeholder=\"비밀번호를 입력해주세요.\"><br>");
        response.getWriter().println("    <input type=\"submit\" value=\"로그인\">");
        response.getWriter().println("</form>");
        response.getWriter().println("</div>");
        
        
           

        // 회원가입으로 가는 하이퍼링크
        response.getWriter().println("<div style=\"position: fixed; bottom: 10px; width: 100%; text-align: center;\">");
        response.getWriter().println("<h2><a href=\"/reg\" style=\"color: grey; text-decoration: none;\">회원이 아니신가요?</a></h2>");
        response.getWriter().println("</div>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }
}