package com.lh.springboot.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestParam;

@Configuration
public class pageConfig {
    @Bean
    public PaginationInnerInterceptor paginationInnerInterceptor(){

        PaginationInnerInterceptor paginationInnerInterceptor = new PaginationInnerInterceptor();
        return paginationInnerInterceptor;

    }



//    @Bean
//    public PaginationInterceptor paginationInterceptor() {
//        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
//        //设置请求超过最大页之后的操作 true 回调到首页
//        paginationInterceptor.setOverflow(true);
//        //设置单页最大的数量
//        paginationInterceptor.setLimit(1000);
//        return paginationInterceptor;
//
//    }
}
