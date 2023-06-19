package com.example.application;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "SummationServlet", value = "/Summation-servlet")
public class SummationServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello Sharda";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));

        // Hello
        PrintWriter writer = response.getWriter();
        boolean html;
        writer.println( +num1+num2  );
        writer.flush();

    }

    public void destroy() {
    }
}