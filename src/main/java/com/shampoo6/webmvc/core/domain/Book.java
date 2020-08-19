package com.shampoo6.webmvc.core.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document
@Builder(toBuilder = true) // 添加此注解可以给对象添加构造器，例如 Book.builder().id().name().build() 返回一个实体
@Data
@ToString(callSuper = true) // @ToString 和 @EqualsAndHashCode 需要加上 callSuper = true 这样才能调用父类字段
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Book extends SuperEntity {
    private String name;
    private String author;
    private BigDecimal price;
}
