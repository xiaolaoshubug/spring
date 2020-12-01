package com.oay.diy;

/*********************************************************
 * @Package: com.oay.diy
 * @ClassName: Pointcut.java
 * @Description：描述
 * -----------------------------------
 * @author：ouay
 * @Version：v1.0
 * @Date: 2020-11-28
 *********************************************************/
public class Pointcut {

    public void before() {
        System.out.println("---------方法执行前---------");
    }

    public void after() {
        System.out.println("---------方法执行后---------");
    }
}
