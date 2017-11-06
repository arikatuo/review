package com.hy.chuanglian;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

/**
 * Created by sumimasah on 2017/9/26.
 */
public class Test_2 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(
                System.in));
        String st = (String) br.readLine();
        String[] result = st.split(" ");
        int[] last = new int[result.length];
        for (int i = 0; i < result.length; i++) {
            last[i] = Integer.parseInt(result[i]);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < last.length; i++) {
            arrayList.add(last[i]);
        }
        Collections.sort(arrayList);
        int sum = 0;
        boolean flag = true;
        for (int i = 0; i < arrayList.size() && flag; i++) {
            //System.out.println(arrayList.get(i));
            sum += (Integer) arrayList.get(i);
            if (sum > money) {
                flag = false;
                sum=sum-(Integer)arrayList.get(i);
            }
        }

        System.out.println(sum);


    }
}
