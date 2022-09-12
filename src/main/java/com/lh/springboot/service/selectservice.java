package com.lh.springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lh.springboot.Mapper.MpMapper;
import com.lh.springboot.Mapper.secletMapper;
import com.lh.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface selectservice extends IService<User> {
    Long run();
}
