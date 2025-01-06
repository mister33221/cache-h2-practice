package com.kai.cache_h2_practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableCaching
public class CacheH2PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CacheH2PracticeApplication.class, args);
	}

}
