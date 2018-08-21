package com.easyloan.compact;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan(basePackages = "com.easyloan")
@MapperScan("com.easyloan.**.mapper")
@EnableTransactionManagement
public class CompactServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompactServiceApplication.class, args);
    }
}
