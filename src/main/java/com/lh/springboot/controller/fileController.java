package com.lh.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@Slf4j
public class fileController {

    @PostMapping("upload")
    @ResponseBody
    public String upload(@RequestParam("email") String email, @RequestParam("username") String username,
                         @RequestPart("headerImg") MultipartFile multipartFile,
                         @RequestPart MultipartFile[] photos) throws IOException {

        log.info("email{}",email);
        log.info("input流{}",multipartFile.getInputStream());
        log.info("Name{}",multipartFile.getName());
        log.info("Name{}",multipartFile.getOriginalFilename());

        if (!multipartFile.isEmpty()){
            String originalFilename = multipartFile.getOriginalFilename();
            multipartFile.transferTo(new File("F:\\aa\\"+originalFilename));
        }

        for (MultipartFile file : photos) {
            if (!file.isEmpty()){
                log.info("Name{}",file.getName());
                String originalFilename = file.getOriginalFilename();
                file.transferTo(new File("F:\\aa\\"+originalFilename));
            }
        }

        return "上传完成";


    }


    @GetMapping("/toupload")
    public String toupload(){
        return "upload";
    }

    @GetMapping("hello")
    public String run(){
        return "helloworld";
    }
}
