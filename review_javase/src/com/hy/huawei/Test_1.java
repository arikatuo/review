package com.hy.huawei;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by sumimasah on 2017/9/26.
 */
public class Test_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a=scanner.next();
        String b=scanner.next();

        char[] x=a.toCharArray();
        char[] y=b.toCharArray();
        ArrayList<Character> arrayList=new ArrayList<Character>();
        for(int i=0;i<x.length;i++){
            for(int j=0;j<y.length;j++){
                if ((x[i]==y[j])){
                    arrayList.add(x[i]);
                }
            }
        }

        for(int i=0 ;i<x.length;i++){
            if (arrayList.indexOf(x[i])!=-1){
                x[i]='_';
            }
        }
        for(int i=0 ;i<y.length;i++){
            if (arrayList.indexOf(y[i])!=-1){
                y[i]='_';
            }
        }

        for(int i=0;i<x.length;i++){
            System.out.print(x[i]);

        }

        System.out.println();
        for(int i=0;i<y.length;i++){
            System.out.print(y[i]);
        }
    }
}
