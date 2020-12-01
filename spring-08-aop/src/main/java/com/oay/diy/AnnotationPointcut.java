package com.oay.diy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/*********************************************************
 * @Package: com.oay.diy
 * @ClassName: AnnotationPointcut.java
 * @Description������
 * -----------------------------------
 * @author��ouay
 * @Version��v1.0
 * @Date: 2020-11-28
 *********************************************************/
@Aspect
public class AnnotationPointcut {

    @Before("execution(* com.oay.service.*.*(..))")
    public void before() {
        System.out.println("---------����ִ��ǰ---------");
    }

    @After("execution(* com.oay.service.*.*(..))")
    public void after() {
        System.out.println("---------����ִ�к�---------");
    }
}
