package com.hy.book.servlet;

import com.hy.book.dao.UserDao;
import com.hy.book.dao.impl.UserDaoImpl;
import com.hy.book.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by dell on 2017/8/8.
 */
@WebServlet(name = "UserServlet")
public class UserServlet extends HttpServlet {
    private UserDao userDao = new UserDaoImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("usename");

        User user = userDao.getUser(username);

        if (user == null) {
            //todo
            response.sendRedirect(request.getServletPath() + "/error-1.jsp");
            return;
        }

        request.setAttribute("user", user);

        request.getRequestDispatcher("/WEB-INF/pages/trade.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
