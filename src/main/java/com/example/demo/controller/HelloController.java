package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;


@RestController
public class HelloController {

    public HelloController() {
        System.out.printf("HelloController 컴포너트 스탠됨");
    }

    //유효성 검사, 파싱, DAO 찾기
    @GetMapping("/home")
    public void home() {
        System.out.printf("home 호출됨");
    }


    //유효성 검사, 파싱, DAO 찾기
    @GetMapping("/hello")
    public String hello() {
        String name = "홍길동";
        return "<h1>hello " + name + "</h1>";
    }

    @GetMapping("/random")
    public String random() {
        Random r = new Random();
        int num = r.nextInt(5) + 1;
        return "<h1>random " + num + "</h1>";
    }
    

}
