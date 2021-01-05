import org.junit.Test;
import org.lxyqaq.spring5.config.TxConfig;
import org.lxyqaq.spring5.entity.User;
import org.lxyqaq.spring5.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @ClassName TestSQL
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/4 22:26
 * @Version 1.0
 */
public class TestSQL {

    @Test
    public void test1() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");

        UserService userService = applicationContext.getBean("userService", UserService.class);

        userService.accountMoney();

    }

    @Test
    public void test2() {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TxConfig.class);

        UserService userService = applicationContext.getBean("userService", UserService.class);

        userService.accountMoney();

    }

    @Test
    public void testGenericApplicationContext() {
        GenericApplicationContext context = new GenericApplicationContext();

        context.refresh();

        context.registerBean("user1", User.class, () -> new User());

        User user = (User) context.getBean("user1");

        System.out.println(user);
    }

}
