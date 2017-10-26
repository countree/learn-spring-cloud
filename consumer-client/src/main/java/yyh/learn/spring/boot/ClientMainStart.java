package yyh.learn.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Spring Boot 应用启动类
 *
 * @author yyh
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class ClientMainStart {
    public static void main(String[] args) {
        SpringApplication.run(ClientMainStart.class, args);
    }
}
