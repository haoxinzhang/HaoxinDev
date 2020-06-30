package com.example.restservice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	private List<User> userList;
	
	GreetingController() {
		userList = new ArrayList<User>();
		userList.add( new User(1, "Haoxin", "Zhang", "hzhang", "test"));
		userList.add( new User(2, "Mike", "Zhang", "hzhang", "test"));
		userList.add( new User(3, "Brad", "Zhang", "hzhang", "test"));
		userList.add( new User(4, "Jack", "Zhang", "hzhang", "test"));
	}

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	@GetMapping("/users")
	public List<User> getUsers() {
		List<User> myList = new ArrayList<User>();
		
		myList.add( new User(1, "Haoxin", "Zhang", "hzhang", "test"));
		myList.add( new User(2, "Mike", "Zhang", "hzhang", "test"));
		myList.add( new User(3, "Brad", "Zhang", "hzhang", "test"));
		myList.add( new User(4, "Jack", "Zhang", "hzhang", "test"));
		
		return userList;	
	}
	
	@GetMapping("/users/{id}")
	public User getUser( @PathVariable int id) {
		
		System.out.println( "id=" + id );
		
//		List<User> myList = new ArrayList<User>();
//		
//		myList.add( new User(1, "Haoxin", "Zhang", "hzhang", "test"));
//		myList.add( new User(2, "Mike", "Zhang", "hzhang", "test"));
//		myList.add( new User(3, "Brad", "Zhang", "hzhang", "test"));
//		myList.add( new User(4, "Jack", "Zhang", "hzhang", "test"));
		
		User user = null;
		for( int i=0; i<userList.size(); i++ ) {
			if( userList.get(i).getId() == id ) {
				user = userList.get(i);
				break;
			}	
		}
		System.out.println(user);
		return user;
	}
	
	@PostMapping("/users/save")
	public User saveUser(@RequestBody User user) {
		userList.add(user);
		return user;
	}
	
	@PutMapping("/users/update")
	public User updateUser( @RequestBody User user) {
		
		for( int i=0; i<userList.size(); i++ ) {
			if( userList.get(i).getId() == user.getId()) {
				userList.get(i).setFirstName( user.getFirstName());
				userList.get(i).setLastName( user.getLastName());
				userList.get(i).setUserGroup( user.getUserGroup());
				userList.get(i).setUserName( user.getUserName());
				break;
			}	
		}
		
		return user;
	}
	
	@GetMapping("/contents")
	public UserContents getUserContents() {
		
		User user = new User(1, "Haoxin", "Zhang", "hzhang", "test");
		StringBuilder stringBuilder = new StringBuilder();
		
		for( int i=0; i<100; i++ ) {
			stringBuilder.append("This is user's content retrived from database");
		}
		
		UserContents userConntents  = new UserContents(user, "text", stringBuilder.toString(), "http://localhost:8084/contents");
		
		return userConntents;	
	}
	
	
}
