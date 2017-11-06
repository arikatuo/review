package com.hy.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by sumimasah on 2017/9/26.
 */
public final class Test_3 {
    private static List<String> nameList = new LinkedList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(
                System.in));
        String st = (String) br.readLine();
        String[] result = st.split("|");
        int[] last = new int[result.length];
        for (int i = 0; i < result.length; i++) {
            last[i] = Integer.parseInt(result[i]);
        }

        for(int i=0;i<result.length;i++){
            String[] result2=result[i].split(".");
        }
    }
}