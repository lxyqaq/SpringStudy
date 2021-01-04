package org.lxyqaq.spring5.service;

import org.lxyqaq.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/4 22:12
 * @Version 1.0
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

    //转账的方法
    public void accountMoney() {

        //第一步
        userDao.reduceMoney();

        //模拟异常
        int a = 10 / 0;

        //第二步
        userDao.addMoney();

        //出现异常，事务回滚

    }

}
