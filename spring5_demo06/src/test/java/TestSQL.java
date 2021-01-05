import org.junit.Test;
import org.lxyqaq.spring5.config.TxConfig;
import org.lxyqaq.spring5.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

}
