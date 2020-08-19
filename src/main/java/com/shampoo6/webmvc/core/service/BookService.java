package com.shampoo6.webmvc.core.service;

public interface BookService {
    boolean isBookDaoExtend();

    String save(String name, String author, Double price);

    boolean update(String id, String name, String author, Double price);
}
