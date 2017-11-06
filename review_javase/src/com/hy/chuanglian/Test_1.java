package com.hy.chuanglian;

import com.hy.Interface.Inter_1;

import java.util.Scanner;

/**
 * Created by sumimasah on 2017/9/26.
 */
public class Test_1 {

    public static void main(String[] args) {
        char[] chars1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char[] chars2 = {'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R'};
        char[] chars3 = {'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' '};

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        String s = scanner.next();

        char[] chars4 = s.toCharArray();
        a = (a + 2) % 3;

        Integer x = 0;

        Integer y = 0;


        int l = chars4.length;
        for (int i = 0; i < l; i++) {
            boolean flag = true;
            for (int j = 0; j < 9 && flag; j++) {
                if (chars4[i] == chars1[j]) {
                    if (a == 0) {
                        x = 1;
                    } else if (a == 1) {
                        x = 3;
                    } else if (a == 2) {
                        x = 2;
                    }

                    y = ((j - (b + 8) % 9) + 9) % 9 + 1;
                    flag = false;
                }
            }
            for (int j = 0; j < 9 && flag; j++) {
                if (chars4[i] == chars2[j]) {
                    if (a == 0) {
                        x = 2;
                    } else if (a == 1) {
                        x = 1;
                    } else if (a == 2) {
                        x = 3;
                    }
                    y = ((j - (b + 8) % 9) + 9) % 9 + 1;
                    flag = false;
                }
            }
            for (int j = 0; j < 9 && flag; j++) {
                if (chars4[i] == chars3[j]) {
                    if (a == 0) {
                        x = 3;
                    } else if (a == 1) {
                        x = 2;
                    } else if (a == 2) {
                        x = 1;
                    }
                    y = ((j - (b + 8) % 9) + 9) % 9 + 1;
                    flag = false;

                }
            }
            System.out.print(x.toString() + y.toString());
            System.out.print(" ");
        }
    }
}
