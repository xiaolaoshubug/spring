import com.oay.entity.User;
import com.oay.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/*********************************************************
 * @Package: PACKAGE_NAME
 * @ClassName: MyTest.java
 * @Description£∫√Ë ˆ
 * -----------------------------------
 * @author£∫ouay
 * @Version£∫v1.0
 * @Date: 2020-11-28
 *********************************************************/
public class MyTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userServiceImpl", UserMapper.class);
        List<User> users = userMapper.queryUserAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
