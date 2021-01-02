package org.lxyqaq.spring5;

import org.junit.Test;
import org.lxyqaq.spring5.bean.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestEmp
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/2 14:29
 * @Version 1.0
 */
public class TestEmp {

    @Test
    public void testAdd() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean3.xml");

        Emp emp = applicationContext.getBean("emp", Emp.class);

        emp.add();

    }

}
