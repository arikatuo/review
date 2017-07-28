package com.hy.java;

/**
 * Created by dell on 2017/7/25.
 */
public class SelectSort {
    public static void SelectSort(long[] array){
        int k=0;
        long temp=0;

        for(int i=0;i<array.length;i++){
            k=i;
            for(int j=i;j<array.length;j++){
                if(array[j]<array[k]){
                    k=j;
                }
            }
            temp=array[i];
            array[i]=array[k];
            array[k]=temp;
        }
    }
}
