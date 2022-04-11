package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
public class ProfileAutoDetectorEnvironmentProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        if (environment.getActiveProfiles().length == 0) {

            String activeProfile = calcActiveProfile();
            environment.setActiveProfiles(activeProfile);
        }
    }

    private String calcActiveProfile() {

        if (getTempreture() < -50) {
            return "winter_is_here";
        } else {
            return "winter_is_coming";
        }
    }

    private int getTempreture() {
        return -78;
    }
}
