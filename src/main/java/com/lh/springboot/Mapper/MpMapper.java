package com.lh.springboot.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lh.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MpMapper extends BaseMapper<User> {

}
