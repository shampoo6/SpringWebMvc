package com.shampoo6.webmvc.core.dao.extend.impl;

import com.mongodb.client.result.UpdateResult;
import com.shampoo6.webmvc.core.dao.extend.BookDaoExtend;
import com.shampoo6.webmvc.core.domain.Book;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.Date;

@Log
public class BookDaoExtendImpl implements BookDaoExtend {

    @Autowired
    private MongoTemplate template;

    @Override
    public boolean isExtendMethod() {
        log.info("================================>template is:");
        log.info(template.toString());
        return true;
    }

    @Override
    public boolean myUpdate(Book book) {
        Query query = new Query().addCriteria(Criteria.where("id").is(book.getId()));
        Update update = new Update();
        update.set("name", book.getName());
        update.set("author", book.getAuthor());
        update.set("price", book.getPrice());
        update.set("updateTime", new Date().getTime());
        UpdateResult ur = template.updateFirst(query, update, Book.class);
        return ur.getModifiedCount() > 0;
    }
}
