package com.lh.springboot.com.li.springboot.mapper;


import com.lh.springboot.service.selectservice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class Mptest {

//    @Qualifier("aaa")
//    @Autowired

    @Resource(name = "seleceServiceImpl")
    selectservice aaa;


    @Test
    void test(){
        Long run = aaa.run();
        System.out.println("==========="+run);
    }
}
