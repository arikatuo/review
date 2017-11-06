package com.hy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by sumimasah on 2017/9/20.
 */
@WebServlet(name = "JspTest")
public class JspTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("执行 dopost");
        String str=request.getParameter("a");
        System.out.println("得到"+str);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("执行 doget");
        String str=request.getParameter("a");
        System.out.println("得到"+str);
    }
}
