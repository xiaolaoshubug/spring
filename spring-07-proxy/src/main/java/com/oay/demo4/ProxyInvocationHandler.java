package com.oay.demo4;

import com.oay.demo3.Rent;

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

    private Object object;

    public void setObject(Object object) {
        this.object = object;
    }

    //  ���ɴ����࣬�ص��ǵڶ�����������ȡҪ����ĳ����ɫ��֮ǰ����һ����ɫ�����ڿ��Դ���һ���ɫ��ֻ��Ҫ�޸ĵڶ���������Ҳ���ǽӿ�ʵ����
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object invoke = method.invoke(object, args);
        return invoke;
    }

    public void log(String message) {
        System.out.println("ʹ����" + message + "����");
    }
}
