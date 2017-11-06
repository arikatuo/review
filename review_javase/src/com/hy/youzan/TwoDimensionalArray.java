package com.hy.youzan;

import java.util.Scanner;

/**
 * Created by sumimasah on 2017/9/21.
 */
public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        int column ;
        int row;
        int number;

        column=scanner.nextInt();
        row=scanner.nextInt();
        number=scanner.nextInt();


        int [][] A = new int[column][row];
        for (int i = 0 ; i < column ; i++){
            for (int j = 0; j< row; j++){
                A[i][j] = i + j;
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
    }


}