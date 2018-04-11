package com.czx.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务提供者
 * EnableDiscoveryClient：启用服务注册与发现 添加 EnableDiscoveryClient 注解后，项目就具有了服务注册的功能。启动工程后，就可以在注册中心的页面看到SPRING-CLOUD-PRODUCER服务
 * 如果须要集群 只须要复制一份服务提供者 改一个端口 注册到同一个eureka 服务中心即可
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MyProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProducerApplication.class, args);
	}
}
