package com.sola.server2.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping(value = "")
@ResponseBody
public class Demo2 {

    @RequestMapping(value = "")
    public Object demo1(){

        return "Demo2" ;
    }

    @RequestMapping(value = "/demo2")
    public Object demo2(){
        return "service demo2 : "+new Date()  ;
    }

}
