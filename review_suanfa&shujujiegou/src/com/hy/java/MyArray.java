package com.hy.java;

import java.util.ArrayList;

/**
 * Created by dell on 2017/7/25.
 */
public class MyArray {
    private long[] array;
    private int element;

    public MyArray() {
        array = new long[50];
    }

    public MyArray(int maxsize) {
        array = new long[maxsize];
    }

    public void insert(long value) {
        array[element] = value;
        element++;
    }

    public void display() {
        System.out.print("[");
        for (int i = 0; i < element; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
    }


    public void delete(int index) {
        if (index < 0 || index >= element) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            for (int i = index; i < element; i++) {
                array[i] = array[i + 1];
            }
            element--;
        }
    }

}
