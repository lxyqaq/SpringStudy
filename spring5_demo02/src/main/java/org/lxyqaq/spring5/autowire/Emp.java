package org.lxyqaq.spring5.autowire;

/**
 * @ClassName Emp
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/2 21:27
 * @Version 1.0
 */
public class Emp {

    private Depa depa;

    public void setDepa(Depa depa) {
        this.depa = depa;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "depa=" + depa +
                '}';
    }

}
