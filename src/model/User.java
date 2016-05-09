package model;

public class User {
	
	private String username;
	private String password;
	
	private static User[] users = {
		new User("admin", "12345678")
	};
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public static User authenticate(String username, String password) {
		for (int i = 0; i < users.length; i++) {
			if (users[i].getUsername().equals(username) && users[i].getPassword().equals(password))
				return users[i];
		}
		
		return null;
	}

}
