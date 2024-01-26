package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
// 템플릿엔진의 리턴 파일을 찾아준다. 리턴값이 파일명이다.
// 파일을 찾아서 포워드 해준다.
//@RestController
// 리턴시에 그 문자를 그대로 응답.
public class UserController {

    @GetMapping("/joinForm")
    public String joinForm() {
        return "joinForm";
    }

    @PostMapping("/join")
    public String join(String username, String password, String email) {
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        String email = request.getParameter("email");

        System.out.println("email = " + email);
        System.out.println("password = " + password);
        System.out.println("username = " + username);

        if (username.length() > 10) {
            return "error-404";
        }

        //return "/main";
        return "redirect:/main";
    }
}

