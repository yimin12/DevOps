package com.yimin.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 *   @Author : Yimin Huang
 *   @Contact : hymlaucs@gmail.com
 *   @Date : 2021/2/7 17:40
 *   @Description :
 *
 */
@SpringBootApplication
public class ServiceApplication {

    public static void main(String[] args) {
        for(String a : args){
            System.out.println(a);
        }
        SpringApplication.run(ServiceApplication.class, args);
    }
}
