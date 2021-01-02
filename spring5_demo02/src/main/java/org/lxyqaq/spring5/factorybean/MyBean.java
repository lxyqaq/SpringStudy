package org.lxyqaq.spring5.factorybean;

import org.lxyqaq.spring5.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName MyBean
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/2 16:21
 * @Version 1.0
 */
public class MyBean implements FactoryBean<Course> {

    @Override
    public boolean isSingleton() {
        return false;
    }

    //定义返回bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

}
