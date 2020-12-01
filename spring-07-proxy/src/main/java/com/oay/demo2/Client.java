package com.oay.demo2;

/*********************************************************
 * @Package: com.oay.demo2
 * @ClassName: Client.java
 * @Description：  客户使用
 * -----------------------------------
 * @author：ouay
 * @Version：v1.0
 * @Date: 2020-11-28
 *********************************************************/
public class Client {

    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);
        proxy.add();
    }
}
