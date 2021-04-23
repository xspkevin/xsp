package com.xsp.amazon.backend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.xsp.amazon.backend.mapper"})
public class AmazonBackendApplication
{
    public static void main( String[] args ) {
        SpringApplication.run(AmazonBackendApplication.class, args);
    }
}
