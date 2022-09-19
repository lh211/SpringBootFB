package com.lh.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude = RedisAutoConfiguration.class)
public class DemoApplication {

    public static void main(String[] args) {
        //返回的是IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
    }

}
