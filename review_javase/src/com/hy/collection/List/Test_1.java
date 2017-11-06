package com.hy.collection.List;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by sumimasah on 2017/9/13.
 */
public class Test_1 {
    public static void main(String[] args) {
        listiterator();
    }



    /**
     * 演示列表迭代器
     */
    public static void listiterator() {
        /**
         * 需求：对集合中的元素取出，在取的过程中进行操作
         */
        ArrayList al = new ArrayList<>();
        al.add("hello 01");
        al.add("hello 02");
        al.add("hello 03");
        al.add("hello 04");
        al.add(null);

        sop(al);

        ListIterator li = al.listIterator();
        while (li.hasNext()) {
            Object object = li.next();
            if (object.equals("hello 03")) {
                li.add("lgl");
            }

        }
        sop(al);

        // 在迭代过程中，准备添加或者删除元素
        // Iterator it = al.iterator();
        // while (it.hasNext()) {
        // Object obj = it.next();
        //
        // if (obj.equals("hello 02")) {
        // // 将这个元素删除
        // // al.add("hello 05");
        // it.remove();
        // sop(obj);
        // }
        // sop(al);
        // }
    }

    /**
     * 输出
     */
    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
