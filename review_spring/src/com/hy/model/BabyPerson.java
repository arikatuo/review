package com.hy.model;

/**
 * Created by dell on 2017/8/1.
 */
public class BabyPerson implements Person {

    @Override
    public void eatBreakfast() {
        System.out.println("小Baby正在吃早餐");
    }

    @Override
    public void eatLunch() {
        System.out.println("小Baby正在吃午餐");
    }

    @Override
    public void eatSupper() {
        System.out.println("小Baby正在吃晚餐");
    }
}
