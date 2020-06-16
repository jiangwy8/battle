package com.battle.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 描述：
 *
 * @ClassName BattleCoreApp
 * @Author jiangwy
 * @Date 2020/6/6 16:19
 **/
@SpringBootApplication
@EnableSwagger2
public class BattleCoreApp {
    public static void main(String[] args) {
        SpringApplication.run(BattleCoreApp.class, args);
    }
}
