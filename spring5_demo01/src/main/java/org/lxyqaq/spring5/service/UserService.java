package org.lxyqaq.spring5.service;

import org.lxyqaq.spring5.dao.UserDao;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/1 22:08
 * @Version 1.0
 */
public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("service add......");
        userDao.update();
    }

}
