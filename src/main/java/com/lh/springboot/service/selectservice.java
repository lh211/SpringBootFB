package com.lh.springboot.service;

import com.lh.springboot.Mapper.MpMapper;
import com.lh.springboot.Mapper.secletMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class selectservice {

    @Autowired
    com.lh.springboot.Mapper.secletMapper secletMapper;

    @Autowired
    MpMapper mpMapper;

    public Long run(){
        return secletMapper.run();
    }
}
