package com.example.restservice;

public class UserContents {
	private User user;
	private String contentType;
	private String contents;
	private String url;
	
	public UserContents(User user, String contentType, String contents, String url) {
		super();
		this.user = user;
		this.contentType = contentType;
		this.contents = contents;
		this.url = url;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "UserContents [user=" + user + ", contentType=" + contentType + ", contents=" + contents + ", url=" + url
				+ "]";
	}
}
