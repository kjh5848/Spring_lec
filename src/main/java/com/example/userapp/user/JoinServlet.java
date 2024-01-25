package com.example.userapp.user;

import com.example.userapp.board.MainServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;

//@WebServlet("/join")
public class JoinServlet extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Content-Type","text/html; charset=utf-8");
        // username=ssar&password=1234&email=ssar@naver.com


//        BufferedReader br = req.getReader();
//
//        String requestBody = "";
//        while (true) {
//            String line = br.readLine();
//
//            if(line == null)break;
//
//            requestBody = requestBody + line;
//
//            System.out.println(requestBody);
//        }

        // 파싱
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");

        System.out.println("username = " + username);
        System.out.println("password = " + password);
        System.out.println("email = " + email);

        //유효성 검사(1000줄됨)
        if (username.length() < 3 || username.length() > 10) {
            resp.getWriter().println("<h1>username의 글자수가 3~10 사이여야 합니다.</h1>");
            return;
        }

        resp.setStatus(302);
        resp.setHeader("Location","/main");
        resp.setHeader("clock","12pm");
//        resp.sendRedirect("/main");
    }
}
