package org.lxyqaq.spring5;

/**
 * @ClassName Book
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/1 21:25
 * @Version 1.0
 */
public class Book {

    private String bname;
    private String bauthor;

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void testDemo() {
        System.out.println("bname = " + bname + " , bauthor = " + bauthor);
    }
}
