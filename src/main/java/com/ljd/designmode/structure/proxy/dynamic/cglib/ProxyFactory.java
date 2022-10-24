package com.ljd.designmode.structure.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/24 15:35
 * @Version 1.0
 */
public class ProxyFactory implements MethodInterceptor {

    private RailwayStation railwayStation = new RailwayStation();

    public RailwayStation getProxy() {
        // 创建对象
        Enhancer enhancer = new Enhancer();
        // 继承核心 设置 真实主题父类的字节码对象
        enhancer.setSuperclass(RailwayStation.class);
        // 设置回调函数 参数是MethodInterceptor的子实现对象 this=ProxyFactory
        enhancer.setCallback(this);
        // 创建RailwayStation代理对象
        RailwayStation proxy = (RailwayStation) enhancer.create();
        return proxy;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理成功");

        // 代理用反射调用真实对象的方法
        /*
             Object obj, 真实对象
             Object... args 真实对象的方法参数
             返回的是 方法的返回值
         */
        Object obj = method.invoke(railwayStation, objects);
        return obj;
    }
}
