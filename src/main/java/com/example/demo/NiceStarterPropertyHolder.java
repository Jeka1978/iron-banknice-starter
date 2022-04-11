package com.example.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Evgeny Borisov
 */
@ConfigurationProperties(prefix = "nice")
@Data
public class NiceStarterPropertyHolder {
    private String projectName;
}
