package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: redleaf
 * @create: 2019/9/11 13:20
 */
@Controller
public class CommitController {

    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        return "the frist commit of redleaf!";
    }

    @ResponseBody
    @RequestMapping("/test2")
    public String test2(){
        return "the frist commit of zhouyajing!";
    }

}
