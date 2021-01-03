package org.lxyqaq.spring5.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/2 22:24
 * @Version 1.0
 */

/**
 * 下面四个注解功能是一样的，都可以用来创建 bean 实例
 * (1)@Component
 * (2)@Service
 * (3)@Controller
 * (4)@Repository
 */

@Service(value = "userService")
public class UserService {

    //在注解里面 value 属性值可以省略不写，
    //默认值是类名称，首字母小写
    //UserService -- userService

    public void add() {
        System.out.println("service add......");
    }

}
