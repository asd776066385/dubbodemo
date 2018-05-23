package com.test;

import com.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"spring-consumer.xml"});
        context.start();
        System.out.println("********开始调用服务********");
        UserService userService = (UserService) context.getBean("userService");
        System.out.println(userService.getAllUser());
    }
}
