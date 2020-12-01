package com.oay.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*********************************************************
 * @Package: com.oay.demo3
 * @ClassName: ProxyInvocationHandler.java
 * @Description�� ��̬�����ɫ
 * -----------------------------------
 * @author��ouay
 * @Version��v1.0
 * @Date: 2020-11-28
 *********************************************************/
public class ProxyInvocationHandler implements InvocationHandler {

    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //  ���ɴ����࣬�ص��ǵڶ�����������ȡҪ����ĳ����ɫ��֮ǰ����һ����ɫ�����ڿ��Դ���һ���ɫ��ֻ��Ҫ�޸ĵڶ���������Ҳ���ǽӿ�ʵ����
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        //  ���ģ��������÷���ʵ�֣�
        Object invoke = method.invoke(rent, args);
        fare();
        return invoke;
    }

    //  ����
    public void seeHouse() {
        System.out.println("�����Ϳ���");
    }

    //  ���н��
    public void fare() {
        System.out.println("���н��");
    }

}
