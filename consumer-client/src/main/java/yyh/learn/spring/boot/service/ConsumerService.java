package yyh.learn.spring.boot.service;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "provider-server")
public interface ConsumerService {


}
