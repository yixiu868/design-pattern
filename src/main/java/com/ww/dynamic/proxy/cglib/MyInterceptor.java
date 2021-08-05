package com.ww.dynamic.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Author wanggw
 * @Date 2020/5/11 10:23
 */
public class MyInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("被代理方法调用前");
        Object res = proxy.invokeSuper(obj, args);
        System.out.println("被代理方法调用后");
        return res;
    }
}
