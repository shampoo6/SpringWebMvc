package com.shampoo6.webmvc.core.controller;

import com.shampoo6.webmvc.core.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/1")
    public Object test1() {
        System.out.println("test1 be called");
        return bookService.isBookDaoExtend();
//        return null;
    }

    @RequestMapping("/save")
    public Object save(String name, String author, Double price) {
        Assert.hasText(name, "书名不能为空");
        Assert.hasText(author, "作者不能为空");
        Assert.notNull(price, "价格不能为空");
        String id = bookService.save(name, author, price);
        return id;
    }

    @RequestMapping("/update")
    public Object save(String id, String name, String author, Double price) {
        Assert.hasText(id, "id不能为空");
        Assert.hasText(name, "书名不能为空");
        Assert.hasText(author, "作者不能为空");
        Assert.notNull(price, "价格不能为空");
        return bookService.update(id, name, author, price);
    }

}
