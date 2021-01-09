package com;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.atguigu.mapper")
public class HelloMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloMainApplication.class,args);


    }
}
