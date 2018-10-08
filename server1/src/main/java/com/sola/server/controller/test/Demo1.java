package com.sola.server.controller.test;

import com.sola.server.feignInterface.Server2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping(value = "")
@ResponseBody
public class Demo1 {

    @Autowired
    private RestTemplate restTemplate ;

    @Autowired
    private Server2 server2 ;

    @RequestMapping(value = "")
    public Object demo1Cloud(){

        try{
            //serviceTest2 注册的服务名
            String forObject = restTemplate.getForObject("http://serviceTest2/demo2", String.class);
            System.out.println(forObject);
        }catch (Exception e){
            e.printStackTrace();
        }

        return "hello sola" ;
    }

    /**
     * 测试使用Feign调用服务
     * @return
     */
    @RequestMapping(value = "/demo2")
    public Object demo2(){
        String result = server2.demo2();
        return "demo2 : " + result ;
    }

}
