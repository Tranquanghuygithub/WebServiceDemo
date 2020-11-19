package com.webservice.service;

import com.webservice.configuration.SpringConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;



public class Demo   {
    public static void main(String[] args) {
        AbstractApplicationContext context= new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService userService=(UserService)context.getBean("userService");


        System.out.println("ID=2 "+userService.getUserById(2));
        System.out.println("ID=2 "+userService.getUserById(2));
        System.out.println("ID=2 "+userService.getUserById(2));

        System.out.println("After refresh all users");

        System.out.println("ID=2 "+userService.getUserById(2));
        System.out.println("ID=2 "+userService.getUserById(2));
        System.out.println("ID=2 "+userService.getUserById(2));
        ((AbstractApplicationContext) context).close();
        System.out.println("Them Edit vao git nay. Them cai conflict");

    }
}
