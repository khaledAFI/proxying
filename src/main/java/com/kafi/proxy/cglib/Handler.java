package com.kafi.proxy.cglib;

import com.kafi.proxy.common.Original;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by kafi on 05/02/2016.
 */
public class Handler implements MethodInterceptor {
    private final Original original;

    public Handler(Original original) {
        this.original = original;
    }

    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("BEFORE");
        method.invoke(original, args);
        System.out.println("AFTER");
        return null;
    }
}
