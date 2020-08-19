package com.shampoo6.webmvc.core.service.impl;

import com.shampoo6.webmvc.core.dao.BookDao;
import com.shampoo6.webmvc.core.domain.Book;
import com.shampoo6.webmvc.core.service.BookService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Log
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public boolean isBookDaoExtend() {
        return bookDao.isExtendMethod();
    }

    @Override
    public String save(String name, String author, Double price) {
        Book book = new Book(name, author, new BigDecimal(price));
        book = bookDao.save(book);
        return book.getId();
    }

    @Override
    public boolean update(String id, String name, String author, Double price) {
        Book book = Book.builder().name(name).author(author).price(new BigDecimal(price)).build();
        book.setId(id);
        return bookDao.myUpdate(book);
    }

}
