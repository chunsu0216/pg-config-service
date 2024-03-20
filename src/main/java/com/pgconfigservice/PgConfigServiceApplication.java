package com.pgconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PgConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PgConfigServiceApplication.class, args);
    }

}
