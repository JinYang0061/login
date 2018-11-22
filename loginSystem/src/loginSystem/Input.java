package loginSystem;

import java.util.Scanner;

public class Input {

	//receive the user input
	public String userInput(String inputFlag) {
		Scanner scan = new Scanner(System.in);
		Validate validate = new Validate();
		boolean nameRight = true;
		boolean passwordRight = true;
		if (inputFlag.equals("name")) {
			System.out.print("Please input the user name:");
			String name = scan.nextLine();
			nameRight = validate.validateName(name);
			if (nameRight) {
				return name;
			} else {
				return "";
			}
		} else {
			System.out.print("Please input the user password:");
			String password = scan.nextLine();
			passwordRight = validate.validatePassword(password);
			if (passwordRight) {
				return password;
			} else {
				return "";
			}
		}
	}
}
