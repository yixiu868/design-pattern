package com.ww.dynamic.proxy.java;

import java.lang.reflect.Proxy;

/**
 * @author wanggw
 */
public class JavaDynamicProxy {

    public static void main(String[] args) {
        JavaDeveloper zack = new JavaDeveloper("Zack");

        String code = "code";
        String debug = "debug";

        Developer zackProxy = (Developer) Proxy.newProxyInstance(zack.getClass().getClassLoader(),
                zack.getClass().getInterfaces(), (proxy, method, args1) -> {
                  if (code.equals(method.getName())) {
                      System.out.println("Zack is praying for the code!");
                      return method.invoke(zack, args1);
                  }

                  if (debug.equals(method.getName())) {
                      System.out.println("Zack's have no bug! No need to debug");
                      return null;
                  }

                  return null;
                });

        zackProxy.code();
        zackProxy.debug();
    }
}
