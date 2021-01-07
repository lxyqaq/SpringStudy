package org.lxyqaq.entity;

/**
 * @ClassName student
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/6 21:33
 * @Version 1.0
 */
public class Student {

    private String name;
    private Integer age;

    public Student() {
        System.out.println("无参数构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
