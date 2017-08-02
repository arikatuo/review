package com.hy.test1;

import org.springframework.stereotype.Component;

/**
 * Created by dell on 2017/8/2.
 */
@Component("b")
public class B {
    public String b;

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public B(){
        System.out.println("----B----");
    }
}
