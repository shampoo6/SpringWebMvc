package com.shampoo6.webmvc.core.dao.parent.impl;

import com.shampoo6.webmvc.core.dao.parent.MongoDao;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.query.MongoEntityInformation;
import org.springframework.data.mongodb.repository.support.SimpleMongoRepository;

public class MongoDaoImpl<T> extends SimpleMongoRepository<T, String> implements MongoDao<T> {
    protected final MongoOperations mongoTemplate;

    protected final MongoEntityInformation<T, String> entityInformation;

    protected Class<T> clazz;

    public MongoDaoImpl(MongoEntityInformation<T, String> metadata, MongoOperations mongoOperations) {
        super(metadata, mongoOperations);
        this.mongoTemplate = mongoOperations;
        this.entityInformation = metadata;
        this.clazz = entityInformation.getJavaType();
    }
}
