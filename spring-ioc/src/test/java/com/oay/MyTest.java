package com.oay;

import com.oay.dao.UserDaoImpl;
import com.oay.dao.UserMysqlDaoImpl;
import com.oay.service.UserService;
import com.oay.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*********************************************************
 * @Package: com.oay
 * @ClassName: MyTest.java
 * @Description£∫√Ë ˆ
 * -----------------------------------
 * @author£∫ouay
 * @Version£∫v1.0
 * @Date: 2020-11-27
 *********************************************************/
public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        /*UserMysqlDaoImpl userMysqlDaoImpl = (UserMysqlDaoImpl) context.getBean("userMysqlDaoImpl");
        userMysqlDaoImpl.getUser();*/
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
        userServiceImpl.getUser();

    }
}
