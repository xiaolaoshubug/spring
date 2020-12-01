package com.oay;

import com.oay.pojo.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*********************************************************
 * @Package: com.oay
 * @ClassName: MyTest.java
 * @Description：描述
 * -----------------------------------
 * @author：ouay
 * @Version：v1.0
 * @Date: 2020-11-27
 *********************************************************/
public class MyTest {

    @Test
    public void test() {
        /*ApplicationContext允许您读取 bean 定义并访问它们*/
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }

}
