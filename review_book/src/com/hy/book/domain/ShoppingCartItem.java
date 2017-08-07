package com.hy.book.domain;

/**
 * Created by dell on 2017/8/7.
 */
public class ShoppingCartItem {
    private Book book;
    private int quantity;


    public float getItemMoney() {
        return book.getPrice() * quantity;
    }

    public void increment() {
        quantity++;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ShoppingCartItem() {
    }

    public ShoppingCartItem(Book book) {
        this.book = book;
        this.quantity = 1;
    }
}
