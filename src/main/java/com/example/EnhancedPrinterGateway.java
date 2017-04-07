package com.example;

import org.springframework.util.concurrent.ListenableFuture;

public interface EnhancedPrinterGateway {
	
	public void print(Person person);
	
	public ListenableFuture<String> printUppercase(Person person);

}
