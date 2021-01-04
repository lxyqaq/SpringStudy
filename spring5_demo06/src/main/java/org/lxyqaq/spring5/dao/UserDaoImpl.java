package org.lxyqaq.spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @ClassName UserDaoImpl
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/4 22:13
 * @Version 1.0
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void reduceMoney() {

        String sql = "update account set money=money-? where username=?";

        jdbcTemplate.update(sql, 100, "Lucy");

    }

    @Override
    public void addMoney() {

        String sql = "update account set money=money+? where username=?";

        jdbcTemplate.update(sql, 100, "Marry");

    }

}
