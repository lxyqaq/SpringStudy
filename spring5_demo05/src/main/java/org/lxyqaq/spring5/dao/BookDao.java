package org.lxyqaq.spring5.dao;

import org.lxyqaq.spring5.entity.Book;

import java.util.List;

/**
 * @ClassName BookDao
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/4 15:19
 * @Version 1.0
 */
public interface BookDao {

    //添加
    public void add(Book book);

    //修改
    public void update(Book book);

    //删除
    public void delete(String id);

    //查询
    public Integer search();

    //根据id查询并返回对象
    public Book findBookInfo(String id);

    //查询返回集合
    public List<Book> findAllBook();

    //批量添加
    public void batchAddBook(List<Object[]> batchArgs);

    //批量修改
    public void batchUpdateBook(List<Object[]> batchArgs);

    //批量删除
    public void batchDeleteBook(List<Object[]> batchArgs);

}
