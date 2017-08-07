package com.hy.book.domain;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dell on 2017/8/7.
 */
public class ShoppingCart {

    private Map<Integer, ShoppingCartItem> books = new HashMap<>();

    public void updateBookItemQuantity(int bookId, int quantity) {
        ShoppingCartItem shoppingCartItem = books.get(bookId);
        if (shoppingCartItem != null) {
            shoppingCartItem.setQuantity(quantity);
        }
    }


    public void removeItem(int bookId) {
        books.remove(bookId);
    }

    public void clear() {
        books.clear();
    }

    public float getTotalMoney() {
        float money = 0;

        for (ShoppingCartItem shoppingCartItem : getItems()) {
            money = money + shoppingCartItem.getItemMoney();
        }

        return money;
    }


    public Collection<ShoppingCartItem> getItems() {
        return books.values();
    }

    public int getBookNumber() {
        int total = 0;
        for (ShoppingCartItem shoppingCartItem : getItems()) {
            total = total + shoppingCartItem.getQuantity();
        }
        return total;
    }

    public Map<Integer, ShoppingCartItem> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        ShoppingCartItem shoppingCartItem = books.get(book.getId());

        if (shoppingCartItem == null) {
            shoppingCartItem = new ShoppingCartItem(book);
            books.put(book.getId(), shoppingCartItem);
        } else {
            shoppingCartItem.increment();
        }
    }


}
