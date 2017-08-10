package com.hy.book.web;

import com.hy.book.domain.ShoppingCart;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by dell on 2017/8/7.
 */
public class BookStoreWebUtils {

    public static ShoppingCart getShopppingcart(HttpServletRequest request) {
        HttpSession session = request.getSession();

        ShoppingCart shoppingCart = (ShoppingCart) session.getAttribute("ShoppingCart");
        if (shoppingCart == null) {
            shoppingCart = new ShoppingCart();
            session.setAttribute("ShoppingCart", shoppingCart);
        }
        return shoppingCart;
    }
}
