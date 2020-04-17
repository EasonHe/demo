package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
    
    private static Logger logger = LoggerFactory.getLogger(DemoApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        logger.debug("项目启动完毕...");
        logger.info("项目启动完毕...");
        logger.warn("项目启动完毕...");
        logger.error("项目启动完毕...");
    }

    @RequestMapping("/")
    public String hello(){   
        return "hello docker";
    }

}
