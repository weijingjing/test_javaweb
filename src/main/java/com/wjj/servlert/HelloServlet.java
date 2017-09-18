package com.wjj.servlert;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet(name = "HelloServlet")
public class HelloServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setStatus(200);
        response.setHeader("haha", "hehe");



        String data = "haha zhejiu shi servlet";
        OutputStream outputStream = response.getOutputStream();
        outputStream.write(data.getBytes("UTF-8"));

    }


}
