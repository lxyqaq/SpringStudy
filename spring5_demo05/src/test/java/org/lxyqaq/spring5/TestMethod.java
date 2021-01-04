package org.lxyqaq.spring5;

import org.junit.Test;
import org.lxyqaq.spring5.entity.Book;
import org.lxyqaq.spring5.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TestMethod
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/4 15:36
 * @Version 1.0
 */
public class TestMethod {

    @Test
    public void test1() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");

        BookService bookService = applicationContext.getBean("bookService", BookService.class);

        Book book = new Book();
        book.setId(6);
        book.setUsername("Kai Sa");
        book.setPassword("xunaxa");

        bookService.addBook(book);

    }

    @Test
    public void test2() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");

        BookService bookService = applicationContext.getBean("bookService", BookService.class);

        Book book = new Book();
        book.setId(5);
        book.setUsername("Qiao Feng");
        book.setPassword("666666");

        bookService.updateBook(book);

    }

    @Test
    public void test3() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");

        BookService bookService = applicationContext.getBean("bookService", BookService.class);

        bookService.deleteBook("4");

    }

    @Test
    public void test4() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");

        BookService bookService = applicationContext.getBean("bookService", BookService.class);

        int count = bookService.searchBook();

        System.out.println(count);
    }

    @Test
    public void test5() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");

        BookService bookService = applicationContext.getBean("bookService", BookService.class);

        System.out.println(bookService.findBook("1"));

    }

    @Test
    public void test6() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");

        BookService bookService = applicationContext.getBean("bookService", BookService.class);

        System.out.println(bookService.findAll());

    }

    @Test
    public void test7() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");

        BookService bookService = applicationContext.getBean("bookService", BookService.class);

        List<Object[]> batchArgs = new ArrayList<>();

        Object[] o1 = {8, "Lu Mingfei", "buyaosi"};
        Object[] o2 = {9, "Tang San", "haishen"};
        Object[] o3 = {10, "Yun Ming", "qingtian"};

        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);

        bookService.batchAdd(batchArgs);

    }

    @Test
    public void test8() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");

        BookService bookService = applicationContext.getBean("bookService", BookService.class);

        List<Object[]> batchArgs = new ArrayList<>();

        Object[] o1 = {"Liu", "qwer", 1};
        Object[] o2 = {"Li", "qweer", 2};
        Object[] o3 = {"Niu", "qweeer", 3};

        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);

        bookService.batchUpdate(batchArgs);

    }

    @Test
    public void test9() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");

        BookService bookService = applicationContext.getBean("bookService", BookService.class);

        List<Object[]> batchArgs = new ArrayList<>();

        Object[] o1 = {1};
        Object[] o2 = {2};

        batchArgs.add(o1);
        batchArgs.add(o2);

        bookService.batchDelete(batchArgs);

    }

}
