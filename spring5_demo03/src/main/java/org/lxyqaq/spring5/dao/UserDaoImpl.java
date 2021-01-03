package org.lxyqaq.spring5.dao;

import org.springframework.stereotype.Repository;

/**
 * @ClassName UserDaoImpl
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/3 11:49
 * @Version 1.0
 */
@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("dao add .......");
    }

}
