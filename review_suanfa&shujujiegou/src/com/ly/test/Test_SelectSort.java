package com.ly.test;

import com.hy.java.BubbleSort;
import com.hy.java.SelectSort;

/**
 * Created by dell on 2017/7/25.
 */
public class Test_SelectSort {
    public static void main(String[] args) {
        long[] array = new long[5];
        array[0] = 1;
        array[1] = 9;
        array[2] = 8;
        array[3] = 7;
        array[4] = -7;


        for (long num: array) {
            System.out.print(num+" ");
        }
        SelectSort.SelectSort(array);
        System.out.println();
        for (long num: array) {
            System.out.print(num+" ");
        }
    }
}
