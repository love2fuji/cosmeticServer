package com.wen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.baomidou.springboot.*.mapper")
@MapperScan("com.wen.dao")
public class CosmeticServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CosmeticServerApplication.class, args);
    }

}
