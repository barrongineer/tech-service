package io.barrongineer.techservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.security.oauth2.resource.EnableOAuth2Resource;

/**
 * Created by shaunn on 3/29/2015.
 */
@EnableEurekaClient
@EnableOAuth2Resource
@SpringBootApplication
public class TechServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechServiceApplication.class, args);
    }
}
