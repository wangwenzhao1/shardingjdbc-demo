package com.cxytiandi.sharding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;

/**
 * Spring Boot Sharding JDBC 分库分表案例
 */
@SpringBootApplication(exclude = JtaAutoConfiguration.class)
public class ShardingDbTableApplication {
	public static void main(String[] args) {
		SpringApplication.run(ShardingDbTableApplication.class, args);
	}
}
