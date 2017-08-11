package com.hy.book.servlet;

import com.google.gson.Gson;
import com.hy.book.dao.AccountDao;
import com.hy.book.dao.BookDao;
import com.hy.book.dao.UserDao;
import com.hy.book.dao.impl.AccountDaoImpl;
import com.hy.book.dao.impl.BookDaoImpl;
import com.hy.book.dao.impl.UserDaoImpl;
import com.hy.book.domain.*;
import com.hy.book.service.BookService;
import com.hy.book.web.BookStoreWebUtils;
import com.hy.book.web.CriteriaBook;
import com.hy.book.web.Page;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.PrivateKey;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dell on 2017/8/8.
 */
@WebServlet(name = "BookServlet")
public class BookServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String methodName = request.getParameter("method");

        try {
            Method method = getClass().getDeclaredMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            method.setAccessible(true);
            method.invoke(this, request, response);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }


    protected void cash(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ShoppingCart shoppingCart = BookStoreWebUtils.getShopppingcart(request);
        String username = request.getParameter("username");
        String accountid = request.getParameter("accountid");

        StringBuffer error = validateFormFiled(username, accountid);
        if (error.toString().equals("")) {
            error = validateUser(username, accountid);
            if (error.toString().equals("")) {
                error = validateBookStoreNumber(request);
                if (error.toString().equals("")) {
                    error = validateBalance(request, accountid);
                }
            }
        }

        if (!error.toString().equals("")) {
            request.setAttribute("error", error);
            request.getRequestDispatcher("/WEB-INF/pages/cash.jsp").forward(request, response);
            return;
        }

        bookService.cash(shoppingCart, username, Integer.parseInt(accountid));
        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response);

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

    private BookService bookService = new BookService();

    //库存
    public StringBuffer validateBookStoreNumber(HttpServletRequest request) {

        ShoppingCart shoppingCart = BookStoreWebUtils.getShopppingcart(request);
        StringBuffer error = new StringBuffer("");
        for (ShoppingCartItem shoppingCartItem : shoppingCart.getItems()) {
            int quantity = shoppingCartItem.getQuantity();
            int store = bookService.getBook(shoppingCartItem.getBook().getId()).getStoreNumber();
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

    public StringBuffer validateFormFiled(String username, String accoundid) {
        StringBuffer error = new StringBuffer("");

        if (username == null) {
            error.append("用户名不能为空");
        }
        if (accoundid == null) {
            error.append("账户名不能为空");
        }

        return error;
    }


    protected void updateItemQuantity(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idStr = request.getParameter("id");
        String quantityStr = request.getParameter("quantity");

        ShoppingCart shoppingCart = BookStoreWebUtils.getShopppingcart(request);

        int id;
        int quantity;

        id = Integer.parseInt(idStr);
        quantity = Integer.parseInt(quantityStr);

        if (id > 0 && quantity > 0) {
            bookService.updateBookQuantity(shoppingCart, id, quantity);
        }
        Map<String, Object> result = new HashMap<>();

        result.put("boobNumber", shoppingCart.getBookNumber());
        result.put("totalMoney", shoppingCart.getTotalMoney());

        Gson gson = new Gson();

        String jsonStr = gson.toJson(result);
        response.setContentType("text/javascript");
        response.getWriter().print(jsonStr);
    }

    protected void clearCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ShoppingCart shoppingCart = BookStoreWebUtils.getShopppingcart(request);

        bookService.clearCart(shoppingCart);

        request.getRequestDispatcher("/WEB-INF/pages/emptycart.jsp").forward(request, response);
    }

    protected void remove(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //int bookId=Integer.parseInt(request.getParameter("bookId"));

        ShoppingCart shoppingCart = BookStoreWebUtils.getShopppingcart(request);
        bookService.removeItemFromShopppingChar(shoppingCart, Integer.parseInt(request.getParameter("bookId")));

        if (shoppingCart.isEmpty()) {
            request.getRequestDispatcher("/WEB-INF/pages/emptycart.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/WEB-INF/pages/cart.jsp").forward(request, response);
        }

    }

    protected void forwardPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String page = request.getParameter("page");
        request.getRequestDispatcher("/WEB-INF/pages/" + page + ".jsp").forward(request, response);
    }

    protected void addToCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ShoppingCart shoppingCart = BookStoreWebUtils.getShopppingcart(request);

        int bookId = Integer.parseInt(request.getParameter("bookId"));

        bookService.addToChar(bookId, shoppingCart);
        getBooks(request, response);

        //        request.getRequestDispatcher("/WEB-INF/pages/cart.jsp").forward(request, response);

        //1. 获取商品的 id
//        String idStr = request.getParameter("bookId");
//        int id = -1;
//        boolean flag = false;
//
//        try {
//            id = Integer.parseInt(idStr);
//        } catch (Exception e) {}
//
//        if(id > 0){
//            //2. 获取购物车对象
//            ShoppingCart sc = BookStoreWebUtils.getShopppingcart(request);
//
//            //3. 调用 BookService 的 addToCart() 方法把商品放到购物车中
//            flag = bookService.addToChar(id, sc);
//        }
//
//        if(flag){
//            //4. 直接调用 getBooks() 方法.
//            getBooks(request, response);
//            return;
//        }
//
//        response.sendRedirect(request.getContextPath() + "/error-1.jsp");

    }

    protected void getBookDetails(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int bookId = Integer.parseInt(request.getParameter("bookId"));

        Book book = bookService.getBook(bookId);
        request.setAttribute("book", book);
        request.getRequestDispatcher("/WEB-INF/pages/bookdetail.jsp").forward(request, response);

    }

    protected void getBooks(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int pageNo = 1;
        float minPrice = 0;
        float maxPrice = Integer.MAX_VALUE;

        //todo
        if (request.getParameter("pageNo") != null) {
            pageNo = Integer.parseInt(request.getParameter("pageNo"));
        }
        if (request.getParameter("minPrice") != null) {
            minPrice = Float.parseFloat(request.getParameter("minPrice"));
        }
        if (request.getParameter("maxPrice") != null) {
            maxPrice = Float.parseFloat(request.getParameter("maxPrice"));
        }


        CriteriaBook criteriaBook = new CriteriaBook(minPrice, maxPrice, pageNo);

        Page<Book> bookPage = bookService.getBookPage(criteriaBook);
        request.setAttribute("page", bookPage);

        request.getRequestDispatcher("/WEB-INF/pages/book2.jsp").forward(request, response);
    }

    protected void test(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/pages/test.jsp").forward(request, response);
    }

}
