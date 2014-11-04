package pl.luwi.java8.demo.model;


public class User {
	
	public static enum Role {
		Viewer, Editor, Admin
	}
	
	private final String login;
	private final Role role;
	
	
	public User(String login, Role role) {
		this.login = login;
		this.role = role;
	}
	
	public String getLogin() {
		return login;
	}
	
	public Role getRole() {
		return role;
	}
}