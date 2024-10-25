package com.ktest.homeshop;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class HomeshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeshopApplication.class, args);
	}
	
	private static final Logger logger = LoggerFactory.getLogger(HomeshopApplication.class);
	
	@Bean
	CommandLineRunner testDBCon(DataSource dataSource) {
		return arg -> {
			try {
				dataSource.getConnection().close();
				logger.info("------------- 연결 성공 ----------");
			} catch (Exception e) {
				// TODO: handle exception
				logger.error("------------ 연결 실패 -----------");
			}
		};
	}
}
