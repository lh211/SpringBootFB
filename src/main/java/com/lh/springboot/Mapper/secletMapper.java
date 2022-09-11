package com.lh.springboot.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface secletMapper {

    @Select("select count(*) from users")
    Long run();
}
