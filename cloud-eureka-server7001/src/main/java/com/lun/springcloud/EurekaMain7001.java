package com.lun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Cnzlike
 * @date 2022/3/28 17:09
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
    public static void main(String[] args) {
        System.out.printf("这是个傻小子");
        System.out.printf("这是个傻小子");
        System.out.printf("这是个傻小子");
        System.out.printf("这是个傻小子");
        System.out.printf("这是个傻小子");
        SpringApplication.run(EurekaMain7001.class, args);
    }
}
