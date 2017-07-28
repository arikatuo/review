package com.hy.java;

/**
 * Created by dell on 2017/7/25.
 */
public class BubbleSort {
    public static void BubbleSort(long[] array) {
        long temp = 0;
//        for (int i = array.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (array[i] < array[j]) {
//                    temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }

        for (int i = 0; i < array.length-1; i++) {
            for (int j = array.length-1; j > i; j--) {
                if (array[j] <array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
}
