package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Evgeny Borisov
 */
public class NiceLogger {

    @Autowired
    private NiceStarterPropertyHolder propertyHolder;

    public void info(String message) {
        System.out.println("nice: "+propertyHolder.getProjectName()+" : " +message);
    }
}
