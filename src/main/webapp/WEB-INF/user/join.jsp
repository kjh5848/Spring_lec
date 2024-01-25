
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    response.setHeader("Content-Type","text/html; charset=utf-8");

    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String email = request.getParameter("email");

    System.out.println("username = " + username);
    System.out.println("password = " + password);
    System.out.println("email = " + email);


    if (username.length() < 3 || username.length() > 10) {
        response.getWriter().println("<h1>username의 글자수가 3~10 사이여야 합니다.</h1>");
        return;
    }

//      request.getRequestDispatcher("/WEB-INF/board/Main.jsp").forward(request, response);
//      response.sendRedirect("/main.do");
        response.setStatus(302);
        response.setHeader("Location","/Main.do");
        response.setHeader("clock","12pm");

%>