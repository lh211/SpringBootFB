package com.lh.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class hellocontroller {
    @GetMapping("/user")
//@RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getUser(){
        System.out.println("fdsafdsa");
        return "GET-张三";
    }

//    @RequestMapping("/index.html")
////@RequestMapping(value = "/user",method = RequestMethod.GET)
//    public String index(){
//        System.out.println("fdsafdsa");
//        return "aa/aaa";
//    }


    @RequestMapping("/index")
//@RequestMapping(value = "/user",method = RequestMethod.GET)
    public String indexa(){
        System.out.println("fdsafdsa");
        return "index";
    }

    @RequestMapping("/aaa")
    @ResponseBody
//@RequestMapping(value = "/user",method = RequestMethod.GET)
    public String aaa(){
        System.out.println("fdsafdsa");
        return "失败重定向";
    }
    @RequestMapping("/aaabb")
    @ResponseBody
//@RequestMapping(value = "/user",method = RequestMethod.GET)
    public String aaaa(){
        System.out.println("fdsafdsa");
        return "aaabb";
    }

    @PostMapping("/user")
//@RequestMapping(value = "/user",method = RequestMethod.POST)
    public String saveUser(){
        return "POST-张三";
    }

    @PutMapping("/user")
//@RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String putUser(){
        return "PUT-张三";
    }

    @DeleteMapping("/user")
//@RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public String deleteUser(){
        return "DELETE-张三";
    }


    @PostMapping("/save")
    public void run(@RequestBody String s, @RequestParam Map<String,String>map){
        System.out.println(s);
        System.out.println(map);

    }
}
