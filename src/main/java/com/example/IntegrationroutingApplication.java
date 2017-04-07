package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.support.MessageBuilder;

@SpringBootApplication
@ImportResource("ftp-integration.xml")
public class IntegrationroutingApplication implements ApplicationRunner {

	@Autowired
	FileWriterGateway fileWriterGateway;

	public static void main(String[] args) {
		SpringApplication.run(IntegrationroutingApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		// simpleGateway.execute("hello world");
		//fileWriterGateway.write("outbound_sample.txt", "This is an outbound channel adpater file");
		fileWriterGateway.read("files/outbound_sample.txt");
	}
}
