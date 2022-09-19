package com.lh.springboot.config;

import com.lh.springboot.Intercept.LoginIntercept;
//import com.lh.springboot.Intercept.countIntercept;
import com.lh.springboot.Intercept.LoginIntercept3;
import com.lh.springboot.Intercept.LoginIntercepta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class hfkhdska implements WebMvcConfigurer {
//    @Autowired
//    countIntercept countIntercept;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginIntercepta())
                .addPathPatterns("/**")
                .excludePathPatterns("/","/aaabb");

        registry.addInterceptor(new LoginIntercept())
                .addPathPatterns("/**")
                .excludePathPatterns("/","/aaabb");
        registry.addInterceptor(new LoginIntercept3())
                .addPathPatterns("/**")
                .excludePathPatterns("/","/aaabb");


//        registry.addInterceptor(countIntercept)
//                .addPathPatterns("/**")
//                .excludePathPatterns("/")
//        .excludePathPatterns("/","/aaabb","/actuator/**");
    }

}
