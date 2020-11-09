package com.qr;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.qr.dao")
public class EbaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EbaoApplication.class, args);
    }

}
