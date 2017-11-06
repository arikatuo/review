package com.hy.InvocationHandler;

/**
 * Created by sumimasah on 2017/9/25.
 */
public class Test_1 {
    public static void main(String[] args) {
        MethodInterface method = MethodProxyFactory.newInstance(MethodInterface.class);
        method.helloWorld();
    }
}
