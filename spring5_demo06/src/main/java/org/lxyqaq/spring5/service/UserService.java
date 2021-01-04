package org.lxyqaq.spring5.service;

import org.lxyqaq.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/4 22:12
 * @Version 1.0
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    //转账的方法
    public void accountMoney() {

        userDao.reduceMoney();

        userDao.addMoney();

    }

}
