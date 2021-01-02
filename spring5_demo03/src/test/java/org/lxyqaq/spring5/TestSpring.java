package org.lxyqaq.spring5;

import org.junit.Test;
import org.lxyqaq.spring5.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestSpring
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/2 22:26
 * @Version 1.0
 */
public class TestSpring {

    @Test
    public void test1() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");

        UserService userService = applicationContext.getBean("userService", UserService.class);

        System.out.println(userService);
        userService.add();

    }

}
