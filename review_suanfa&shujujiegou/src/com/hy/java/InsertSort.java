package com.hy.java;

/**
 * Created by dell on 2017/7/25.
 */
public class InsertSort {
    public static void InsertSort(long[] array) {
        long temp;

        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            int j = i;
            while (j > 0 && array[j] >=temp) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }


    }
}
