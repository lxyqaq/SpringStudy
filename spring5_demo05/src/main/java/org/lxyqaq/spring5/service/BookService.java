package org.lxyqaq.spring5.service;

import org.lxyqaq.spring5.dao.BookDao;
import org.lxyqaq.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName BookService
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/4 15:20
 * @Version 1.0
 */
@Service
public class BookService {

    //注入Dao
    @Autowired
    private BookDao bookDao;

    //添加
    public void addBook(Book book) {
        bookDao.add(book);
    }

    //修改
    public void updateBook(Book book) {
        bookDao.update(book);
    }

    //删除
    public void deleteBook(String id) {
        bookDao.delete(id);
    }

    //查询
    public Integer searchBook() {
        return bookDao.search();
    }

    //根据id查询并返回对象
    public Book findBook(String id) {
        return bookDao.findBookInfo(id);
    }

    //查询返回集合
    public List<Book> findAll() {
        return bookDao.findAllBook();
    }

    //批量添加
    public void batchAdd(List<Object[]> batchArgs) {
        bookDao.batchAddBook(batchArgs);
    }

    //批量修改
    public void batchUpdate(List<Object[]> batchArgs) {
        bookDao.batchUpdateBook(batchArgs);
    }

    //批量删除
    public void batchDelete(List<Object[]> batchArgs) {
        bookDao.batchDeleteBook(batchArgs);
    }

}
