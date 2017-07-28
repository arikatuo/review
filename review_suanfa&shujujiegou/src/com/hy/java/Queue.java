package com.hy.java;

/**
 * Created by dell on 2017/7/25.
 */
public class Queue {
    private int front;
    private int end;
    private int element;
    private int[] array;

    public Queue() {
        front = 0;
        end = -1;
        array = new int[5];
        element = 0;
    }

    public Queue(int size) {
        front = 0;
        end = -1;
        array = new int[size];
        element = 0;
    }

    //队尾插入数据
    public void insert(int value) {
        array[++end] = value;
        element++;
    }

    //对头删除
    public int remove() {
        element--;
        return array[front];
    }


}
