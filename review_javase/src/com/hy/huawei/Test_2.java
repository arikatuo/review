package com.hy.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sumimasah on 2017/9/26.
 */
public class Test_2 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(
                System.in));
        String st = null;
        try {
            st = (String) br.readLine();
        } catch (IOException e) {
            System.out.println("ERROR");
            return;
        }


        String[] result = st.split("-");
        if (result[0].length() != 1 || result[1].length() != 3 || result[2].length() != 5) {
            System.out.println("ERROR");
            return;
        }

        int[] last = new int[result.length];
        for (int i = 0; i < result.length; i++) {
            try {
                last[i] = Integer.parseInt(result[i]);
            }catch (NumberFormatException e){
                System.out.println("ERROR");
            }
        }

        //int number=last[0]*100000000+last[1]*100000+last[2];


        int number1 = last[0] * 1;
        int number2 = (last[1] / 100) * 2 + last[1] % 100 / 10 * 3 + last[1] % 10 * 4;
        int number3 = (last[2] / 10000) * 5 + ((last[2] % 10000) / 1000) * 6 + (((last[2] % 10000) % 1000) / 100) * 7 + ((((last[2] % 10000) % 1000) % 100) / 10) * 8 + (last[2] % 10) * 9;

        int number = number1 + number2 + number3;
        number = number % 11;

        System.out.println(st + "-" + number);


    }
}
