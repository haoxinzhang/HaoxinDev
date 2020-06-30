package com.javatechie.spring.mockito.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document(collection = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
	@Id
	private int id;
	private String name;
	private int age;
	private String address;
	
//	User( int id, String name, int age, String address) {
//		this.id = id;
//		this.name = name;
//		this.age = age;
//		this.address = address;
//	}

}
