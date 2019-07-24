package com.project.jpa.project;

import java.io.IOException;
import java.net.InetAddress;

import org.apache.http.HttpHost;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ProjectApplication.class, args);
		
//		RestClient restClient = RestClient.builder(
//			    new HttpHost("localhost", 9200, "http"),
//			    new HttpHost("localhost", 9300, "http")).build();
//		restClient.close();
	}

}
