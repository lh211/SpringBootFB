package com.lh.springboot.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lh.springboot.Mapper.MpMapper;
import com.lh.springboot.entity.User;
import com.lh.springboot.entity.Person;
import com.lh.springboot.exception.exceptiona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@ConfigurationProperties(prefix = "person")  //锁定配置文件中的值
//@Data
public class hello {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Qualifier("seleceServiceImpl")
    @Autowired
    com.lh.springboot.service.selectservice selectservice;

    @Autowired
    MpMapper mpMapper;

    @Value("${person.name:aiaiaiaiai}")
    private String name;

//    @Autowired
//    private Person person;

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


    @GetMapping("profile")
    public Person profile()  {
        Person person = new Person();
        person.setAge(33);
        person.setName("dfsa");
        return person;
    }





}
