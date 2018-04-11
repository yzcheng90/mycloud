package com.czx.consumer.service.hystrix;

import com.czx.consumer.service.IndexInterface;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * 开启服务调用熔断处理当Hystrix Command请求后端服务失败数量超过一定比例(默认50%), 断路器会切换到开路状态(Open).
 * 这时所有请求会直接失败而不会发送到后端服务. 断路器保持在开路状态一段时间后(默认5秒), 自动切换到半开路状态(HALF-OPEN).
 * 这时会判断下一次请求的返回情况, 如果请求成功, 断路器切回闭路状态(CLOSED), 否则重新切换到开路状态(OPEN).
 * Hystrix的断路器就像我们家庭电路中的保险丝, 一旦后端服务不可用, 断路器会直接切断请求链, 避免发送大量无效请求影响系统吞吐量, 并且断路器有自我检测并恢复的能力.
 *
 * 该类为Fallback相当于是降级操作.
 * 对于查询操作, 我们可以实现一个fallback方法,
 * 当请求后端服务出现异常的时候,
 * 可以使用fallback方法返回的值.
 * fallback方法的返回值一般是设置的默认值或者来自缓存.
 *
 * 需要在IndexInterface类添加指定fallback类，在服务熔断的时候返回fallback类中的内容。
 *
 * Created by czx on 2018/4/10.
 */
@Component
public class IndexHystrix implements IndexInterface{

    @Override
    public String hello(@RequestParam(value = "name")String name) {
        return "请求hello方法"+name+"失败！";
    }
}
