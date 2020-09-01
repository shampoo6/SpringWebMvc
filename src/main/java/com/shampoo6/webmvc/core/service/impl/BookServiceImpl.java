package com.shampoo6.webmvc.core.service.impl;

import com.shampoo6.webmvc.core.constant.BizCode;
import com.shampoo6.webmvc.core.dao.BookDao;
import com.shampoo6.webmvc.core.domain.Book;
import com.shampoo6.webmvc.core.exception.BizException;
import com.shampoo6.webmvc.core.service.BookService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Log4j2
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
        if(name.contains("共产党")) {
            throw new BizException(BizCode.MinGanCi, "共产党");
        }
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
