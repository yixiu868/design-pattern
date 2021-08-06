package com.ww.proxy.dynamic.java;

import java.lang.reflect.Proxy;

/**
 * @author wanggw
 */
public class JavaDynamicProxy implements Developer {
    
    private Developer javaDeveloper;
    
    public JavaDynamicProxy(Developer javaDeveloper) {
        this.javaDeveloper = javaDeveloper;
    }
    
    /**
     * 返回动态代理对象
     * @return
     */
    private Developer getProxyDeveloper() {
        String code = "code";
        String debug = "debug";
        
        return (Developer) Proxy.newProxyInstance(javaDeveloper.getClass().getClassLoader(), javaDeveloper.getClass().getInterfaces(), 
                (proxy, method, args1) -> {
                  if (code.equals(method.getName())) {
                      System.out.println("Zack is praying for the code!");
                      return method.invoke(javaDeveloper, args1);
                  }

                  if (debug.equals(method.getName())) {
                      System.out.println("Zack's have no bug! No need to debug");
                      return null;
                  }

                  return null;
                });
    }

    @Override
    public void code() {
        getProxyDeveloper().code();
    }

    @Override
    public void debug() {
        getProxyDeveloper().debug();
    }
}
