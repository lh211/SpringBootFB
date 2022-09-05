package com.lh.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.SERVICE_UNAVAILABLE,reason = "自定义异常")
public class exceptiona extends Exception{
    public exceptiona() {
    }

    public exceptiona(String message) {
        super(message);
    }
}
