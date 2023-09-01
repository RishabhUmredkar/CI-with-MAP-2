package model;

public class User {

	private int id;
	private String name, email;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}


	@Override
	public String toString() {
		return "User [id = " + id + ", name = " + name + ", email = " + email + "]";
	}
	
	
}
