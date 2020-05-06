package com.qikegu.demo.controller;
import com.jd.jsf.gd.config.ConsumerConfig;
import com.jd.jsf.gd.config.RegistryConfig;


public class APIController {

    public static void main(String[] args) {

        // 注册中心实现，全局唯一（必须）
        RegistryConfig jsfRegistry = new RegistryConfig();
        jsfRegistry.setIndex("i.jsf.jd.com");

        // 服务提供者连接注册中心，设置属性
        ConsumerConfig<HelloService> consumerConfig = new ConsumerConfig<HelloService>();
        consumerConfig.setInterfaceId("com.jd.testjsf.HelloService");
        consumerConfig.setAlias("alias");
        consumerConfig.setProtocol("jsf");
        consumerConfig.setRegistry(jsfRegistry);


        HelloService service = consumerConfig.refer();
        // 得到调用端代理后 请缓存下来保持单例

        try {
            String result = service.echoStr("test");
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
