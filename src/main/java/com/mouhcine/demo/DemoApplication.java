package com.mouhcine.demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    ApplicationRunner runner(PersonRepos personRepos){
        return args -> {
            personRepos.save(new Person("mohsin"));
            personRepos.save(new Person("omar"));
            personRepos.save(new Person("fatah"));
        };

    }
}
