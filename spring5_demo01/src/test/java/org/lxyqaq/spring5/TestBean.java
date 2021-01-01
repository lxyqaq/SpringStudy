package org.lxyqaq.spring5;

import org.junit.Test;
import org.lxyqaq.spring5.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestBean
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/1 22:22
 * @Version 1.0
 */
public class TestBean {

    @Test
    public void testUpdate() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");

        UserService userService = applicationContext.getBean("userService", UserService.class);

        userService.add();

    }

}
