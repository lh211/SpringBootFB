package com.lh.springboot.controller;

import com.lh.springboot.exception.exceptiona;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

    @GetMapping("hellow")
    @ResponseStatus(value = HttpStatus.UNAUTHORIZED)
    public String run(int a) throws exceptiona {
        if (a==0){
            throw new exceptiona();
        }

        return "helloworld";
    }
}
