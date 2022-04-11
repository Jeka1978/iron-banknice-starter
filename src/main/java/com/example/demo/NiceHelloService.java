package com.example.demo;

import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author Evgeny Borisov
 */




public class NiceHelloService {


    @Scheduled(fixedDelay = 1000)
    public  void hello(){
        System.out.println("Hello Nice");
    }

    public void killAll(){
        //never do that
        System.exit(666);
    }
}
