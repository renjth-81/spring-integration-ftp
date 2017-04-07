package com.example;

public class PersonDirectoryService {
	
	public Person findNewPerson(){
		System.out.println("Inbound adapter has polled this service");
		return new Person("renjith",33);
	}

}
