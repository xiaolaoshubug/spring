package com.oay.demo4;

import com.oay.demo2.UserService;
import com.oay.demo2.UserServiceImpl;

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
        //  真是角色    ----- 业务层
        UserServiceImpl userService = new UserServiceImpl();
        //  生成代理对象  ------  由于新增了业务，所以使用代理去处理新增的业务
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setObject(userService);
        //  获得代理对象
        //  代理对象去调用方法
        /*UserService proxy = (UserService) pih.getProxy();
        proxy.add();*/
        AddProxy proxy = (AddProxy) pih.getProxy();
        proxy.addUser();
    }
}
