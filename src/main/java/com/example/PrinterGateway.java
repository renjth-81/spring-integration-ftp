package com.example;

import org.springframework.messaging.Message;

public interface PrinterGateway {
	
	public void print(Message<?> message);

}
