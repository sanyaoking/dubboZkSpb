package com.mengchaob.dubbo.producer.servicei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ServiceiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceiApplication.class, args);
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            //利用nextXXX()方法输出内容
            String str = sc.next();
            System.out.println(str);
        }

    }

}

