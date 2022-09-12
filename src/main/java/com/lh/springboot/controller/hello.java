package com.lh.springboot.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lh.springboot.Mapper.MpMapper;
import com.lh.springboot.entity.User;
import com.lh.springboot.exception.exceptiona;
import com.lh.springboot.service.selectservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class hello {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Qualifier("seleceServiceImpl")
    @Autowired
    com.lh.springboot.service.selectservice selectservice;

    @Autowired
    MpMapper mpMapper;

    @GetMapping("hellow")
    @ResponseStatus(value = HttpStatus.UNAUTHORIZED)
    public String run(int a) throws exceptiona {
        if (a==0){
            throw new exceptiona();
        }

        return "helloworld";
    }

    @GetMapping("sql")
    public Long sql()  {
        Long aLong = jdbcTemplate.queryForObject("select count(*) from users", Long.class);

        return aLong;
    }

    @GetMapping("select")
    public Long sqla()  {
        Page<User> page = new Page<>(1,2);
        selectservice.page(page,null);



        return selectservice.run();
    }



}
