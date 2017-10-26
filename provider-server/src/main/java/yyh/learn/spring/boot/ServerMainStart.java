package yyh.learn.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Spring Boot 应用启动类
 *
 * @author yyh
 */
@SpringBootApplication
@EnableEurekaClient
public class ServerMainStart {
    public static void main(String[] args) {
        SpringApplication.run(ServerMainStart.class, args);
    }
}
