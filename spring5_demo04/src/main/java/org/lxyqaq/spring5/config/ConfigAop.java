package org.lxyqaq.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @ClassName ConfigAop
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/4 14:33
 * @Version 1.0
 */
@Configuration
@ComponentScan(basePackages = {"org.lxyqaq.spring5"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {



}
