# mycloud
spring cloud + eureka +zuul +hystrix + 集群 微服务开发框架



**使用版本：** 
- Spring Boot 1.5.9
- Spring Cloud Dalston.RELEASE




**学习记录**



启动步骤<br>
1、my-eureka        MyEurekaApplication.java 启动  <br>
2、my-producer      MyProducerApplication.java 启动 <br>
3、my-consumer      MyConsumerApplication.java 启动 <br>
3、my-zuul          MyZuulApplication.java 启动 <br>


集群配置<br>

**eureka集群**  
1、只须要复制my-eureka 一份改一个端口即可 <br>
2、eureka.client.serviceUrl.defaultZone http://localhost:8000/eureka/     <br>
3、这里IP先设置为localhost ，后期 配置nginx 后可改为nginx的域 <br>
4、eureka 的集群配置是把多个节点交叉配置就可以  比如当前节点为8000  eureka2 配置为 8001<br>


**producer集群**<br>
1、只须要复制my-producer 一份改一个端口即可<br>
2、访问http://localhost:8000/ 可看到 my-producer有两个服务 eureka 自动负载均衡<br>





***学习博客***

- <a href="http://www.ityouknow.com">纯洁的微笑</a> 
- <a href="http://blog.didispace.com/categories/Spring-Cloud">程序猿DD</a>
- <a href="https://blog.csdn.net/column/details/15197.html">方志朋 Spring Cloud 专栏</a>
- <a href="http://xujin.org/categories/%E8%B7%9F%E6%88%91%E5%AD%A6Spring-Cloud/">许进 跟我学Spring Cloud</a>



- 这个项目会持续更新记录学习，对你有帮助的可以给个star <br>
- 一起学习的可以加QQ群：17470566 <br>
- 本人QQ：913624256

