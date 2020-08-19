package com.shampoo6.webmvc.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = {
        MongoAutoConfiguration.class,
        MongoDataAutoConfiguration.class // 加这个能手动配置MappingMongoConverter
})
@ComponentScan(basePackages = {"com.shampoo6.webmvc.core"})
@EnableMongoRepositories(basePackages = {"com.shampoo6.webmvc.core.dao"})
@EnableMongoAuditing // jpa审计 会自动添加createTime等
public class WebmvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebmvcApplication.class, args);
    }

}
