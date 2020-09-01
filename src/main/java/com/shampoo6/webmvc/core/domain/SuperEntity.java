package com.shampoo6.webmvc.core.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.mongodb.core.index.Indexed;

import javax.persistence.EntityListeners;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public abstract class SuperEntity implements Serializable {
    @Id
    private String id;
    @Indexed
    @CreatedDate
    private long createTime;
    @Indexed
    @LastModifiedDate
    private long updateTime;
}
