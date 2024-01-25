package com.example.userapp.config;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

// FrontController
@WebServlet("*.do")
public class DispatcherServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 공통로직
        System.out.println("common logic ~~~~~~~");
        resp.setHeader("Content-Type","text/html; charset=utf-8");

        //2. 분기
        //포트번호 뒤에있는 쿼리 스트링을 따준다.
        String uri = req.getRequestURI();
        System.out.println(uri);

        if (uri.equals("/join-form.do")) {
            //resp.sendRedirect("/WEB-INF/user/join-form.jsp");
            req.getRequestDispatcher("/WEB-INF/user/join-form.jsp").forward(req, resp);

        }else if (uri.equals("/join.do")) {
            req.getRequestDispatcher("/WEB-INF/user/join.jsp").forward(req, resp);

        } else if (uri.equals("/Main.do")) {
            req.getRequestDispatcher("/WEB-INF/board/Main.jsp").forward(req, resp);

        } else {
            resp.setStatus(404);
            resp.getWriter().println("잘못된 페이지를 요청");
        }
    }
}
