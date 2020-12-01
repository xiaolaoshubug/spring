package com.oay.diy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/*********************************************************
 * @Package: com.oay.diy
 * @ClassName: AnnotationPointcut.java
 * @Description：描述
 * -----------------------------------
 * @author：ouay
 * @Version：v1.0
 * @Date: 2020-11-28
 *********************************************************/
@Aspect
public class AnnotationPointcut {

    @Before("execution(* com.oay.service.*.*(..))")
    public void before() {
        System.out.println("---------方法执行前---------");
    }

    @After("execution(* com.oay.service.*.*(..))")
    public void after() {
        System.out.println("---------方法执行后---------");
    }
}
