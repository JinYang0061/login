package loginSystem;

public class Login {
	//start program
	public static void main(String[] args) {
		Input input = new Input();
		User user = new User();
		String name = "";
		while (name.equals("")) {
			name = input.userInput("name");
			if (!name.equals("")) {
				user.setName(name);
			}
		}

		String password = "";
		while (password.equals("")) {
			password = input.userInput("password");
			if (!password.equals("")) {
				user.setPassword(password);
			}
		}
	}
}
