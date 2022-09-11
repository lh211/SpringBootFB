package com.lh.springboot.controller;

import com.lh.springboot.exception.exceptiona;
import com.lh.springboot.service.selectservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    com.lh.springboot.service.selectservice selectservice;

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

        return selectservice.run();
    }



}
