package org.lxyqaq.spring5.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @ClassName TxConfig
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/5 14:53
 * @Version 1.0
 */

@Configuration //配置类
@ComponentScan(basePackages = "org.lxyqaq") //组件扫描
@EnableTransactionManagement //开启事务
public class TxConfig {

    //创建数据库连接池
    @Bean
    public DruidDataSource getDruidDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/student");
        dataSource.setUsername("root");
        dataSource.setPassword("19980128");
        return dataSource;
    }

    //创建Jdbc模板对象
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
        //到IOC容器中根据类型找到dataSource
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        //注入dataSource
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    //创建事务管理器对象
    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource) {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }

}
