package com.lh.springboot.com.li.springboot.mapper;

import com.lh.springboot.Mapper.MpMapper;
import com.lh.springboot.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class Mptest {

    @Autowired
    MpMapper mpMapper;
    @Test
    void test(){
        User user = mpMapper.selectById(1L);
        System.out.println("==========="+user);
    }
}
