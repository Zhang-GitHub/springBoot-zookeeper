package com.demo.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        new String[]{"classpath:springmvc.xml"});
        context.start();

        System.out.println("Dubbo provider start....");

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
