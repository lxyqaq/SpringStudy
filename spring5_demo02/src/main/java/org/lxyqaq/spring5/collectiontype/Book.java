package org.lxyqaq.spring5.collectiontype;

import java.util.List;

/**
 * @ClassName Book
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/2 15:33
 * @Version 1.0
 */
public class Book {

    private List<String> bookList;

    public void setBookList(List<String> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookList=" + bookList +
                '}';
    }

    public void test() {
        System.out.println(bookList);
    }
}
