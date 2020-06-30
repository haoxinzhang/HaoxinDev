package com.example.restservice;

public class User {
	private Integer id;
	private String firstName;
	private String lastName;
	private String userName;
	private String userGroup;

//	User(Integer id, String firstName, String lastName, String userName, String userGroup) {
//		this.id = id;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.userName = userName;
//		this.userGroup = userGroup;
//	}

	public User(Integer id, String firstName, String lastName, String userName, String userGroup) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.userGroup = userGroup;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserGroup() {
		return userGroup;
	}

	public void setUserGroup(String userGroup) {
		this.userGroup = userGroup;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
				+ ", userGroup=" + userGroup + "]";
	}
}
