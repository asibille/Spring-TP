package com.efrei.tp1springcomponent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp1Application {

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Tp1Application.class, args);
        ctx.getBean(MyServiceConsumer.class).useMyService();
        ctx.getBean(MyServiceConsumer.class).useAnotherService();
    }

}

