package com.lh.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@Data
@TableName("users")
public class User {

    private Long id;
    private String name;
    @TableField(exist = false)
    private String username;
    private String password;
    private String email;
    private Date birthday;

}
