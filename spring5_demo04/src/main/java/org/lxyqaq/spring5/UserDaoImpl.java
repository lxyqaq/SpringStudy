package org.lxyqaq.spring5;

/**
 * @ClassName UserDaoImpl
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/3 13:17
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public String update(String id) {
        return id;
    }

}
