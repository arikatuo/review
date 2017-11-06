package com.hy.collection.List;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by sumimasah on 2017/9/14.
 */
public class Test_2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("a");
        set.add("bb");
        set.add("ba");
        set.add("c");
        set.add("d");
        set.add("f");

        set.add("e");

        set.size();

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
