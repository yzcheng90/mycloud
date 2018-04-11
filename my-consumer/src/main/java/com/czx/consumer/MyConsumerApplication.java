package com.czx.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 服务消费者
 * EnableEurekaClient ：启用服务注册与发现
 * EnableFeignClients ：启用feign进行远程调用
 * 会自动在 服务中心 寻找 服务提供者，
 * 在服务消费者中配置Hystrix熔断器，当 服务提供者 挂掉后，会自动返回fallback 设置的内容
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class MyConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyConsumerApplication.class, args);
	}
}
