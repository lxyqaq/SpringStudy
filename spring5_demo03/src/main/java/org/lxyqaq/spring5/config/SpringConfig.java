package org.lxyqaq.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName SpringConfig
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/3 12:33
 * @Version 1.0
 */
@Configuration//作为配置类，替代xml配置文件
@ComponentScan(basePackages = {"org.lxyqaq.spring5"})
public class SpringConfig {

}
