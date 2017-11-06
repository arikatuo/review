package com.hy.mogujie;

/**
 * Created by sumimasah on 2017/9/23.
 */


import java.util.Scanner;

public class Test_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        int tianshu = 0;
        int days = 0;
        if (3000 > y && y > 0 && m > 0 && 13>m && d > 0 && d < 32) {
            for (int i = 1; i < m; i++) {
                switch (i) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        days = 31;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        days = 30;
                        break;
                    case 2: {
                        if ((y % 1 != 0 && y % 4 == 0) || (y%400==0)) {
                            days = 29;
                        } else {
                            days = 28;
                        }
                        break;
                    }
                }
                tianshu = tianshu + days;
            }
            tianshu = tianshu + d;
            System.out.println(tianshu);
        }
    }
}