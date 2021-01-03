package org.lxyqaq.spring5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @ClassName JDKProxy
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/3 13:18
 * @Version 1.0
 */
public class JDKProxy {

    //使用Proxy类创建接口代理对象
    public static void main(String[] args) {

        //创建接口实现类代理对象
        Class[] interfaces = {UserDao.class};

        UserDaoImpl userDao = new UserDaoImpl();

        /*
         * 第一参数，类加载器
         * 第二参数，增强方法所在的类，这个类实现的接口，(支持多个接口)
         * 第三参数，实现这个接口 InvocationHandler，创建代理对象，写增强的部分
         * */

        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));

        int result = dao.add(1, 2);

        System.out.println("result = " + result);

    }

}

//创建代理对象代码
class UserDaoProxy implements InvocationHandler {

    //把创建的是谁的代理对象，把谁传递过来

    //有参数的构造传递
    private Object object;

    public UserDaoProxy(Object object) {
        this.object = object;
    }

    //增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法之前
        System.out.println("方法之前执行了：" + method.getName() + " 传递的参数... " + Arrays.toString(args));

        //被增强的方法执行
        Object res = method.invoke(object, args);

        //方法之后
        System.out.println("方法之后执行.... " + object);

        return res;
    }
}
