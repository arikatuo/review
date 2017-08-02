package com.hy.test1;

import org.springframework.stereotype.Component;

/**
 * Created by dell on 2017/8/2.
 */

@Component("c")
public class C {
    private String c;

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public C() {
        System.out.println("----C----");
    }
}
