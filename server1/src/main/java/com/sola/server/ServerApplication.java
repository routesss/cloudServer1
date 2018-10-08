package com.sola.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients //启用feign访问服务
@SpringBootApplication
@EnableEurekaClient
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args) ;
    }

}
