package com.lun.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Configuration;

/**
 * @author Cnzlike
 * @date 2022/4/2 9:53
 */
@Configuration
public class FeignConfig {
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
