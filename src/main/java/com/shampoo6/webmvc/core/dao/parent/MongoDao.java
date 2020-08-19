package com.shampoo6.webmvc.core.dao.parent;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface MongoDao<T> extends MongoRepository<T, String> {
}
