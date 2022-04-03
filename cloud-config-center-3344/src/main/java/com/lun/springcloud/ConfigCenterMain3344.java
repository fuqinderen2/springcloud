package com.lun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Cnzlike
 * @date 2022/4/3 13:28
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {
    public static void main(String[] args) {
        System.out.printf("这是个傻小子");
        System.out.printf("这是个傻小子"); System.out.printf("这是个傻小子");

        SpringApplication.run(ConfigCenterMain3344.class, args);
    }
}
