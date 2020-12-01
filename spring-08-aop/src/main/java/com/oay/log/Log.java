package com.oay.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/*********************************************************
 * @Package: com.oay.log
 * @ClassName: Log.java
 * @Description������
 * -----------------------------------
 * @author��ouay
 * @Version��v1.0
 * @Date: 2020-11-28
 *********************************************************/
public class Log implements MethodBeforeAdvice {
    //  method : Ҫִ�е�Ŀ�����ķ���
    //  objects : �����õķ����Ĳ���
    //  Object : Ŀ�����
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName() + "��" + method.getName() + "������ִ����");
    }
}
