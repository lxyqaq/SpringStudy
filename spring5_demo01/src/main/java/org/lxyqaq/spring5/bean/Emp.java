package org.lxyqaq.spring5.bean;

/**
 * @ClassName Emp
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/2 14:18
 * @Version 1.0
 */
public class Emp {

    private String ename;
    private String gender;
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void add() {
        System.out.println("ename = " + ename + " gender = " + gender + " dept = " + dept);
    }

}
