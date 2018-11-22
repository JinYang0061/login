package loginSystem;

import java.util.regex.*;

public class Validate {
	// name validation
	public boolean validateName(String inputName) {
		if (!inputName.equals("")) {
			String name = inputName.trim();
			String pattern = "[a-zA-Z ]+";
			boolean isMatch = Pattern.matches(pattern, name);
			if (isMatch) {
				int nameLength = name.length();
				if (nameLength >= 3 && nameLength <= 10) {
					return true;
				} else {
					System.out.println("Error:The input name should be between 3 and 10!");
					return false;
				}
			} else {
				System.out.println("Error:The input name should only contain letter!");
				return false;
			}
		} else {
			System.out.println("Error:The input name should not be empty!");
			return false;
		}
	}

	// password validation
	public boolean validatePassword(String password) {
		int passLength = password.length();
		boolean isDigit = false;
		boolean isLetter = false;
		boolean isSymbol = false;

		if (passLength != 0) {
			if (password.charAt(0) != ' ' && password.charAt(passLength - 1) != ' ') {
				for (int i = 0; i < passLength; i++) {
					if (Character.isDigit(password.charAt(i))) {
						isDigit = true;
					} else if (Character.isLetter(password.charAt(i))) {
						isLetter = true;
					} else {
						isSymbol = true;
					}
				}

				if (isDigit && isLetter && isSymbol) {
					return true;
				} else {
					System.out.println("Error:Input password should be the mix of letters,numbers and symbols!");
					return false;
				}
			} else {
				System.out.println("Error:The input password should not start or end with a blank space!");
				return false;
			}
		} else {
			System.out.println("Error:The input password should not be empty!");
			return false;
		}
	}
}
