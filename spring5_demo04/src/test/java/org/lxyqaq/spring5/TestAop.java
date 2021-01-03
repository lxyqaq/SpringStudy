package org.lxyqaq.spring5;

import org.junit.Test;
import org.lxyqaq.spring5.aopanno.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestAop
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/3 22:02
 * @Version 1.0
 */
public class TestAop {

    @Test
    public void test1() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");

        User user = applicationContext.getBean("user", User.class);

        user.add();

    }

}
