package com.shampoo6.webmvc.core.dao;

import com.shampoo6.webmvc.core.dao.extend.BookDaoExtend;
import com.shampoo6.webmvc.core.dao.parent.MongoDao;
import com.shampoo6.webmvc.core.domain.Book;

import java.math.BigDecimal;

public interface BookDao extends MongoDao<Book>, BookDaoExtend {
    Book findFirstByNameAndPrice(String name, BigDecimal price);
}
