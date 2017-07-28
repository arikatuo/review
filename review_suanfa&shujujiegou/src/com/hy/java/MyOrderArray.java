package com.hy.java;

/**
 * Created by dell on 2017/7/25.
 */
public class MyOrderArray {
    private long[] array;
    private int element;

    public MyOrderArray() {
        array = new long[50];
    }

    public MyOrderArray(int maxsize) {
        array = new long[maxsize];
    }

    //有序插入
    public void orderinsert(long value) {
        int i;
        for (i = 0; i < element; i++) {
            if (array[i] > value) {
                break;
            }
        }
        for (int j = element; j > i; j--) {
            array[j] = array[j - 1];
        }
        array[i] = value;
        element++;
    }

    public void display() {
        System.out.print("[");
        for (int i = 0; i < element; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
    }

    public int binaySearch(int value) {
        int middle = 0;
        int low = 0;
        int pow = element;
        while (true) {
            middle = (low + pow) / 2;
            if (array[middle] == value) {
                return middle;
            }else if (low>pow){
                return -1;
            }else {
                if (array[middle] > value) {
                    pow = middle - 1;
                } else {
                    low = middle + 1;
                }
            }


        }


    }
}
