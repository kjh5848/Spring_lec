package shop.mtcoding.conbasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpMethodController {

    @GetMapping("req/get")
    public String methodGet() {
        return "<h1>get 요청</h1>";
    }

    @PostMapping("/req/post")
    public String methodPost() {

    }
}
