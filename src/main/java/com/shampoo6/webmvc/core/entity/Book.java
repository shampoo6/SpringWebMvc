package com.shampoo6.webmvc.core.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document
@Data
public class Book extends SuperEntity {
    private String name;
    private String author;
    private BigDecimal price;
}
