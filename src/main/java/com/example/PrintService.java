package com.example;

import org.springframework.messaging.Message;

public class PrintService {

	public void print(Message<?> message) {
		System.out.println("string print service");
		System.out.println(message);
	}

}
