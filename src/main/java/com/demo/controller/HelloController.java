package com.demo.controller;

import com.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return helloService.hello( "leezhen" );
    }

    @ResponseBody
    @RequestMapping("/queryTaskTable")
    public String queryTaskTable(){
        helloService.queryTaskTable( "POLICY" );
        return "";
    }
}
