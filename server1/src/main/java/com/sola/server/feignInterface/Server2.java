package com.sola.server.feignInterface;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//name 需要访问的服务端名
@FeignClient(name = "serviceTest2")
public interface Server2 {

    //url调用服务的url值
    @GetMapping("/demo2")
    String demo2() ;

}
