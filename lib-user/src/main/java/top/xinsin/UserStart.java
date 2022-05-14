package top.xinsin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

/**
 * @Author xinxin
 * @Date 2021/12/11 17:16
 * @Version 1.0
 */
@MapperScan("top.xinsin.dao")
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class UserStart {
    public static void main(String[] args){SpringApplication.run(UserStart.class,args);}
}