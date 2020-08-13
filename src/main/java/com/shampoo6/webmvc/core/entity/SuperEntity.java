package com.shampoo6.webmvc.core.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class SuperEntity {
    @Id
    private String id;
    @CreatedDate
    private long createTime;
    @LastModifiedDate
    private long updateTime;
}
