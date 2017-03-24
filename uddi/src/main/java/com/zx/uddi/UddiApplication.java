package com.zx.uddi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class UddiApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(UddiApplication.class).web(true).run(args);
	}
}
