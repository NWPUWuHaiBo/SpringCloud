package cn.whb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author haiboWu
 * @create 2020-03-21 10:32
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class OrderFeign {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeign.class, args);
    }
}
