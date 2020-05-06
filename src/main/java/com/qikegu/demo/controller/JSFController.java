package com.qikegu.demo.controller;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JSFController {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("/jsf-consumer.xml");
        HelloService service = (HelloService) appContext.getBean("helloService");

        try {
            String result = service.echoStr("zhanggeng put");
        } catch (Exception e) {
        }

        // JSFContext.destroy();
    }
}