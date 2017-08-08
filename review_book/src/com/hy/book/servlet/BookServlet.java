package com.hy.book.servlet;

import com.hy.book.dao.AccountDao;
import com.hy.book.dao.UserDao;
import com.hy.book.dao.impl.AccountDaoImpl;
import com.hy.book.dao.impl.UserDaoImpl;
import com.hy.book.domain.Account;
import com.hy.book.domain.ShoppingCart;
import com.hy.book.domain.ShoppingCartItem;
import com.hy.book.domain.User;
import com.hy.book.web.BookStoreWebUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by dell on 2017/8/8.
 */
@WebServlet(name = "BookServlet")
public class BookServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getParameter("method");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }


    protected void cash(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String accountid = request.getParameter("accountid");


    }

    private AccountDao accountDao = new AccountDaoImpl();

    //余额
    public StringBuffer validateBalance(HttpServletRequest request, String accountid) {
        StringBuffer error = new StringBuffer("");
        ShoppingCart shoppingCart = BookStoreWebUtils.getShopppingcart(request);

        Account account = accountDao.getAccount(Integer.valueOf(accountid).intValue());

        if (shoppingCart.getTotalMoney() > account.getBalance()) {
            error.append("余额不足");
        }
        return error;
    }

    //库存
    public StringBuffer validateBookStoreNumber(HttpServletRequest request) {

        ShoppingCart shoppingCart = BookStoreWebUtils.getShopppingcart(request);
        StringBuffer error = new StringBuffer("");
        for (ShoppingCartItem shoppingCartItem : shoppingCart.getItems()) {
            int quantity = shoppingCartItem.getQuantity();
            int store = shoppingCartItem.getBook().getStoreNumber();
            if (quantity > store) {
                error.append(shoppingCartItem.getBook().getTitle() + "库存不足<br>");
            }
        }
        return error;
    }

    private UserDao userDao = new UserDaoImpl();

    //账户名和账号id匹配
    public StringBuffer validateUser(String username, String accountid) {
        User user = userDao.getUser(username);
        boolean flag = false;
        if (user != null) {
            if (accountid.trim().equals("" + user.getAccountId())) {
                flag = true;
            }
        }

        StringBuffer error = new StringBuffer("");
        if (!flag) {
            error.append("用户账号不匹配");
        }

        return error;
    }
}
