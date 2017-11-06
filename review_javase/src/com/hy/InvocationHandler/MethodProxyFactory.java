package com.hy.InvocationHandler;

import java.lang.reflect.Proxy;

/**
 * Created by sumimasah on 2017/9/25.
 */
public class MethodProxyFactory {
    public static <T> T newInstance(Class<T> methodInterface) {
        final MethodProxy<T> methodProxy = new MethodProxy<T>(methodInterface);
        return (T) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{methodInterface}, methodProxy);
    }
}