package com.example.demo.member;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "doLoginServle", value = "/member/doLogin-servlet")
public class DoLoginServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("uname");

        resp.getWriter().println(name);
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //编码
        req.setCharacterEncoding("utf8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; chartset=utf-8");

        String name = req.getParameter("uname");
        PrintWriter writer = resp.getWriter();
        writer.write("usernmae: " + name);
        writer.close();
    }
}
