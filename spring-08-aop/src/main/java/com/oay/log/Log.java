package com.oay.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/*********************************************************
 * @Package: com.oay.log
 * @ClassName: Log.java
 * @Description：描述
 * -----------------------------------
 * @author：ouay
 * @Version：v1.0
 * @Date: 2020-11-28
 *********************************************************/
public class Log implements MethodBeforeAdvice {
    //  method : 要执行的目标对象的方法
    //  objects : 被调用的方法的参数
    //  Object : 目标对象
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName() + "的" + method.getName() + "方法被执行了");
    }
}
