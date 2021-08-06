package com.ww.proxy.dynamic.java;

import org.junit.Test;

public class JavaProxyTest {

    @Test
    public void test01() {
        Developer sourceObj = new JavaDeveloper("Zack");
        Developer targetObj = new JavaDynamicProxy(sourceObj);
        
        targetObj.code();
        targetObj.debug();
    }
}
