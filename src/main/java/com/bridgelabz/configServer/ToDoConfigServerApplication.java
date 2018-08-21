package com.bridgelabz.configServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Chaitra Ankolekar
 * Purpose :Config server
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ToDoConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoConfigServerApplication.class, args);
	}
}
