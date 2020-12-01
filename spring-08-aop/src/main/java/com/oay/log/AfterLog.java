package com.oay.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/*********************************************************
 * @Package: com.oay.log
 * @ClassName: AfterLog.java
 * @Description������
 * -----------------------------------
 * @author��ouay
 * @Version��v1.0
 * @Date: 2020-11-28
 *********************************************************/
public class AfterLog implements AfterReturningAdvice {
    //  returnValue ����ֵ
    //  method�����õķ���
    //  args �����õķ����Ķ���Ĳ���
    //  target �����õ�Ŀ�����
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("ִ����" + target.getClass().getName()
                + "��" + method.getName() + "����,"
                + "����ֵ��" + returnValue);
    }
}
