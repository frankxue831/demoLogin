package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;


//@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 86400*30)
public class RedisSessionConfig {
	@Bean
	LettuceConnectionFactory factory(){
		return new LettuceConnectionFactory("localhost", 6397);
	}
}
