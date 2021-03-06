package org.lxyqaq.spring5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @ClassName TestSpring5
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/1 17:53
 * @Version 1.0
 */
public class TestSpring5 {

    @Test
    public void testAdd() {

        //1.加载spring配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");

        //2.获取配置创建的对象
        User user = applicationContext.getBean("user", User.class);

        System.out.println(user);
        user.add();

    }

    @Test
    public void testBook1() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");

        Book book = applicationContext.getBean("book", Book.class);

        System.out.println(book);
        book.testDemo();

    }

    @Test
    public void testOrders1() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");

        Orders orders = applicationContext.getBean("orders", Orders.class);

        System.out.println(orders);
        orders.ordersTest();

    }
}
