package com.oay.demo3;

/*********************************************************
 * @Package: com.oay.demo1
 * @ClassName: Client.java
 * @Description：描述
 * -----------------------------------
 * @author：ouay
 * @Version：v1.0
 * @Date: 2020-11-28
 *********************************************************/
public class Client {

    public static void main(String[] args) {
        //  真实角色
        Host host = new Host();
        //  代理实例的调用处理程序
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //  将真实角色放置进去！
        pih.setRent(host);
        //  动态生成对应的代理类！去实现功能
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
