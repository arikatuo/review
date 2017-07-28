package com.hy.java;

/**
 * Created by dell on 2017/7/25.
 */
public class Stack {
    private int[] array;
    private int top;

    public Stack() {
        array = new int[4];
        top = -1;
    }

    public Stack(int size) {
        array = new int[size];
        top = -1;
    }

    //    插入数据
    public void push(int value) {
        array[++top] = value;
    }

    //    删除数据
    public int pop() {
        return array[top--];
    }

    //判断空
    public boolean isEmpty() {
        return top == -1;
    }

    //    判断满
    public boolean isFull() {
        return top == array.length - 1;
    }
}
