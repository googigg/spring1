package com.example.demo.dto;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data
@Configuration
@ConfigurationProperties(prefix = "service-response-time")
public class ServiceResponseTimeConfig {

    private List<GroupedUrl> groupedUrls;

}
