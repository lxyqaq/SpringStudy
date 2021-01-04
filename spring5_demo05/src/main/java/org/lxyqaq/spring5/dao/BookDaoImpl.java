package org.lxyqaq.spring5.dao;

import org.lxyqaq.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName BookDaoImpl
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/4 15:20
 * @Version 1.0
 */
@Repository
public class BookDaoImpl implements BookDao {

    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //添加
    @Override
    public void add(Book book) {

        //创建sql语句
        String sql = "insert into users values(?, ?, ?)";

        //调用方法实现
        Object[] args = {book.getId(), book.getUsername(), book.getPassword()};

        int update = jdbcTemplate.update(sql, args);

        System.out.println(update);

    }

    //修改
    @Override
    public void update(Book book) {

        String sql = "update users set username=?, password=? where id=?";

        Object[] args = {book.getUsername(), book.getPassword(), book.getId()};

        int update = jdbcTemplate.update(sql, args);

        System.out.println(update);

    }

    @Override
    public void delete(String id) {

        String sql = "delete from users where id=?";

        Object[] args = {id};

        int update = jdbcTemplate.update(sql, args);

        System.out.println(update);

    }

    @Override
    public Integer search() {

        String sql = "select count(*) from users";

        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);

        return count;

    }

    @Override
    public Book findBookInfo(String id) {

        String sql = "select * from users where id=?";

        //调用方法
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);

        return book;

    }

    @Override
    public List<Book> findAllBook() {

        String sql = "select * from users";

        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));

        return bookList;

    }

    @Override
    public void batchAddBook(List<Object[]> batchArgs) {

        String sql = "insert into users values(?,?,?)";

        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);

        System.out.println(Arrays.toString(ints));

    }

    @Override
    public void batchUpdateBook(List<Object[]> batchArgs) {

        String sql = "update users set username=?, password=? where id=?";

        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);

        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchDeleteBook(List<Object[]> batchArgs) {

        String sql = "delete from users where id=?";

        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);

        System.out.println(Arrays.toString(ints));

    }
}
