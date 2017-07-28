package com.ly.test;

import com.hy.java.Stack;

/**
 * Created by dell on 2017/7/25.
 */
public class Test_Stack {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(2);
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
    }
}
