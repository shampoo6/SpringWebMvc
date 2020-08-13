package com.shampoo6.webmvc.boot;

import com.shampoo6.webmvc.core.config.MongoConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.shampoo6.webmvc.core")
public class WebmvcApplication {

    public static void main(String[] args) {
        MongoConfig mongoConfig = new MongoConfig();
        SpringApplication.run(WebmvcApplication.class, args);
    }

}
