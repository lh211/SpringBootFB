package com.lh.springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lh.springboot.Mapper.MpMapper;
import com.lh.springboot.entity.User;
import com.lh.springboot.service.selectservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeleceServiceImpl extends ServiceImpl<MpMapper, User> implements selectservice {
    @Autowired
    com.lh.springboot.Mapper.secletMapper secletMapper;

    @Autowired
    MpMapper mpMapper;

    @Override
    public Long run() {
        return secletMapper.run();
    }
}
