package com.oay.demo4;

import com.oay.demo2.UserService;
import com.oay.demo2.UserServiceImpl;

/*********************************************************
 * @Package: com.oay.demo1
 * @ClassName: Client.java
 * @Description������
 * -----------------------------------
 * @author��ouay
 * @Version��v1.0
 * @Date: 2020-11-28
 *********************************************************/
public class Client {

    public static void main(String[] args) {
        //  ���ǽ�ɫ    ----- ҵ���
        UserServiceImpl userService = new UserServiceImpl();
        //  ���ɴ������  ------  ����������ҵ������ʹ�ô���ȥ����������ҵ��
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setObject(userService);
        //  ��ô������
        //  �������ȥ���÷���
        /*UserService proxy = (UserService) pih.getProxy();
        proxy.add();*/
        AddProxy proxy = (AddProxy) pih.getProxy();
        proxy.addUser();
    }
}
