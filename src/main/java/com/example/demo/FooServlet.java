package com.example.demo;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "fooServlet", value = "/foo-servlet")
public class FooServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String lang = "中文";
        request.setAttribute("lang", lang);
        request.getRequestDispatcher("foo.jsp").forward(request,response);
    }

    public void destroy() {
    }
}