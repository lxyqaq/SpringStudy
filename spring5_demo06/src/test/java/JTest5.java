import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.lxyqaq.spring5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @ClassName JTest5
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/5 15:58
 * @Version 1.0
 */
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:bean1.xml")
@SpringJUnitConfig(locations = "classpath:bean1.xml")
public class JTest5 {

    @Autowired
    private UserService userService;

    @Test
    public void test1() {
        userService.accountMoney();
    }

}
