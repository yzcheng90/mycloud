# mycloud
spring cloud + eureka +zuul +hystrix + 集群 微服务开发框架

```学习记录```

启动步骤
1、my-eureka        MyEurekaApplication.java 启动
2、my-producer      MyProducerApplication.java 启动
3、my-consumer      MyConsumerApplication.java 启动
3、my-zuul          MyZuulApplication.java 启动


集群配置
eureka集群   
1、只须要复制my-eureka 一份改一个端口即可
2、eureka.client.serviceUrl.defaultZone http://localhost:8000/eureka/    
3、这里IP先设置为localhost ，后期 配置nginx 后可改为nginx的域,
4、eureka 的集群配置是把多个节点交叉配置就可以  比如当前节点为8000  eureka2 配置为 8001

producer集群  
1、只须要复制my-producer 一份改一个端口即可
2、访问http://localhost:8000/ 可看到 my-producer有两个服务 eureka 自动负载均衡

