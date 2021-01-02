package org.lxyqaq.spring5.collectiontype;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestSout
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/2 15:08
 * @Version 1.0
 */
public class TestSout {

    @Test
    public void testSout() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");

        Stu stu = applicationContext.getBean("stu", Stu.class);

        stu.sout();

    }

    @Test
    public void test() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");

        Book book = applicationContext.getBean("book", Book.class);

        book.test();

    }

}
