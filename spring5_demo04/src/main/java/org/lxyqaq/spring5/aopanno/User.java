package org.lxyqaq.spring5.aopanno;

import org.springframework.stereotype.Component;

/**
 * @ClassName User
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/3 21:38
 * @Version 1.0
 */
//被增强的类
@Component
public class User {
    public void add() {
        System.out.println("add........");
    }
}
