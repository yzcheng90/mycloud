package com.czx.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


/**
 * spring cloud zuul已经帮我们做了默认配置。
 * 默认情况下，Zuul会代理所有注册到Eureka Server的微服务，
 * 并且Zuul的路由规则如下：http://ZUUL_HOST:ZUUL_PORT/微服务在Eureka上的serviceId/**会被转发到serviceId对应的微服务
 *
 * 如果不想暴露服务名 可在application.yml配置文件中使用别名：
 * 如： api-a:path  ***
 * 如： api-a:serviceId  ***
 */
@SpringBootApplication
@EnableZuulProxy
public class MyZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyZuulApplication.class, args);
	}
}
