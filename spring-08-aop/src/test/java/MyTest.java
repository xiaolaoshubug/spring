import com.oay.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*********************************************************
 * @Package: PACKAGE_NAME
 * @ClassName: MyTest.java
 * @Description：描述
 * -----------------------------------
 * @author：ouay
 * @Version：v1.0
 * @Date: 2020-11-28
 *********************************************************/
public class MyTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //  代理的对象一定是接口
        UserService userService = (UserService) context.getBean("userService");
        userService.select();
    }
}
