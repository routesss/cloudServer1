package com.sola.server.RestTemplate;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestTemplateBean {

    /**
     * 后续查询资料 在使用springcloud ribbon客户端负载均衡的时候，可以给RestTemplate bean 加一个@LoadBalanced注解，就能让这个RestTemplate在请求时拥有客户端负载均衡的能力
     * @return
     */
    @Bean //注入spring容器
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate() ;
    }

}
