package loginSystem;

public class User {
	private String userName;
	private String userPassword;

	public String getName() {
		return userName;
	}

	public String getPasword() {
		return userPassword;
	}

	public void setName(String name) {
		userName = name;
	}
	
	public void setPassword(String password) {
		userPassword = password;
	}
}
