package com.oay.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*********************************************************
 * @Package: com.oay.demo3
 * @ClassName: ProxyInvocationHandler.java
 * @Description： 动态代理角色
 * -----------------------------------
 * @author：ouay
 * @Version：v1.0
 * @Date: 2020-11-28
 *********************************************************/
public class ProxyInvocationHandler implements InvocationHandler {

    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //  生成代理类，重点是第二个参数，获取要代理的抽象角色！之前都是一个角色，现在可以代理一类角色，只需要修改第二个参数，也就是接口实现类
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        //  核心：本质利用反射实现！
        Object invoke = method.invoke(rent, args);
        fare();
        return invoke;
    }

    //  看房
    public void seeHouse() {
        System.out.println("带房客看房");
    }

    //  收中介费
    public void fare() {
        System.out.println("收中介费");
    }

}
