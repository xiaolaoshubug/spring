package com.oay.pojo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/*********************************************************
 * @Package: com.oay.pojo
 * @ClassName: Cat.java
 * @Description£∫√Ë ˆ
 * -----------------------------------
 * @author£∫ouay
 * @Version£∫v1.0
 * @Date: 2020-11-27
 *********************************************************/
@Import(Dog.class)
public class Cat {


    public void shout(){
        System.out.println("miao~");
    }

}
