package io.pivotal.cfservicebroker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "io.pivotal.cfservicebroker")
@EnableAutoConfiguration
@EnableJpaRepositories

public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
