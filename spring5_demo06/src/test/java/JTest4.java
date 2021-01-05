import org.junit.Test;
import org.junit.runner.RunWith;
import org.lxyqaq.spring5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName JTest4
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/5 15:47
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:bean1.xml")
public class JTest4 {

    @Autowired
    private UserService userService;

    @Test
    public void test1() {
        userService.accountMoney();
    }

}
