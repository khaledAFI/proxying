package com.kafi.proxy.cglib;

import com.kafi.proxy.common.Original;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * Created by kafi on 05/02/2016.
 */
public class App {

    public static void main(String[] args){
        Original original = new Original();
        MethodInterceptor handler = new Handler(original);
        Original f = (Original) Enhancer.create(Original.class,handler);
        f.originalMethod("Hello");
    }
}
