package com.kafi.proxy.common;

import com.kafi.proxy.dynamic.If;

/**
 * Created by kafi on 05/02/2016.
 */
public  class Original implements If {
    public void originalMethod(String s) {
        System.out.println(s);
    }
}
