package com.lh.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Data
@ConfigurationProperties(prefix = "person")
//@Profile("aaa")
public class Person implements Serializable {

    private String name;
    private Integer age;
}
