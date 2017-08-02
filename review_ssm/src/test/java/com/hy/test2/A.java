package com.hy.test2;

import com.hy.test1.B;
import com.hy.test1.C;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created by dell on 2017/8/2.
 */

@Component("a")
public class A {
 //   @Resource(name = "b")
    private B b;
 //   @Resource(name = "c")
    private C c;

    public B getB() {
        return b;
    }

    public C getC() {
        return c;
    }

    @Resource(name = "b")
    public void setB(B b) {
        System.out.println("---AB---" + this);
        this.b = b;
    }
    @Resource(name = "c")
    public void setC(C c) {
        System.out.println("---AC---" + this);
        this.c = c;
    }

    public A() {
        System.out.println("----A----");

        System.out.println();
    }
}
