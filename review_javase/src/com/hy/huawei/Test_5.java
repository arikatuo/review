package com.hy.huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test_5 {

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int money=reader.nextInt();
        String s=reader.nextLine();
        System.out.println("s===="+s);
        String[] c=s.split(" ");
       // System.out.println("c===="+c[1]);
//		String c[]={"5","5"};
        int price;
        List<Integer> pricelist=new ArrayList<Integer>();
        for(int i=0;i<c.length;i++){
            price=Integer.parseInt(c[i]);

            pricelist.add(price);
        }
        Collections.sort(pricelist);
        int sum=0;
        for(int i=0;i<pricelist.size();i++){
            sum+=pricelist.get(i);
            if(sum>money){
                sum-=pricelist.get(i);
                break;
            }
        }
        System.out.println(sum);

    }

}
