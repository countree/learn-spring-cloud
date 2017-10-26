package yyh.learn.spring.boot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
    /**
     * 当作eureka服务的时候这个不管用了
     * <p>  '/ ' 默认不让用， 也不能指定context-path</p>
     */
    @RequestMapping("/")
    public String hello() {
        return "Hello,World!";
    }


    @RequestMapping("/hello")
    public String hello2() {
        return "Hello,World!";
    }
}
