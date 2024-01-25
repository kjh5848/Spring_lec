package com.example.demo2;

import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

// 라우팅
public class Dispatcher {

    public static void route(String cmd, HttpServletResponse resp) throws IOException {
        if(cmd.equals("user")){
            resp.getWriter().println("<h1>user</h1>");
        }else if(cmd.equals("borad")){
            resp.getWriter().println("<h1>borad</h1>");
        }
    }
}