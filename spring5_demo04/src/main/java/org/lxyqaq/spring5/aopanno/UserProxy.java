package org.lxyqaq.spring5.aopanno;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @ClassName UserProxy
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/3 21:38
 * @Version 1.0
 */
//增强的类
//生成代理对象
@Component
@Aspect
public class UserProxy {

    @Before(value = "execution(* org.lxyqaq.spring5.aopanno.User.add(..))")
    public void before() {
        System.out.println("brfore");
    }

    @After(value = "execution(* org.lxyqaq.spring5.aopanno.User.add(..))")
    public void after() {
        System.out.println("after");
    }

    @Around(value = "execution(* org.lxyqaq.spring5.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("环绕之前");

        proceedingJoinPoint.proceed();

        System.out.println("环绕之后");

    }

    @AfterReturning(value = "execution(* org.lxyqaq.spring5.aopanno.User.add(..))")
    public void afterReturning() {
        System.out.println("afterReturning");
    }

    @AfterThrowing(value = "execution(* org.lxyqaq.spring5.aopanno.User.add(..))")
    public void afterThrowing() {
        System.out.println("afterThrowing");
    }

}
