package com.ly.test;

import com.hy.java.BubbleSort;

/**
 * Created by dell on 2017/7/25.
 */
public class Test_BubbleSort {
    public static void main(String[] args) {
        long[] array = new long[4];
        array[0] = 1;
        array[1] = 9;
        array[2] = 8;
        array[3] = 7;


        for (long num: array) {
            System.out.print(num+" ");
        }
        BubbleSort.BubbleSort(array);
        System.out.println();
        for (long num: array) {
            System.out.print(num+" ");
        }
    }
}
