package cn.whb.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author haiboWu
 * @create 2020-03-18 19:42
 */
@Configuration
public class ApplicationContextConfig {

    //RestTemplate 相当于httpclient 去调用服务端
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
