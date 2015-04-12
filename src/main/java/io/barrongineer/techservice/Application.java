package io.barrongineer.techservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.security.oauth2.resource.EnableOAuth2Resource;

/**
 * Created by shaunn on 3/29/2015.
 */
@SpringBootApplication
@EnableOAuth2Resource
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
