package com.azamda.solid_principle;

//Violates SRP
class Controller {//we have seen in monolithic application
	boolean login(String username, String password) {
		if (username.equals("azam") && password.equals("1234"))
			return true;
		return false;
	}

	boolean registration(String username, String password, String confirmPassword) {
		if (password.equals(confirmPassword))
			return true;
		return false;
	}
}

//adheres to SRP
class LoginController {//now in micro-services we follow SRP
	boolean login(String username, String password) {
		if (username.equals("azam") && password.equals("1234")) {
			return true;
		}
		return false;
	}
}
class RegisterController {
	boolean registration(String username, String password, String confirmPassword) {
			if (password.equals(confirmPassword)) {
            return true;
        }
        return false;
	}
}
public class SingleResponsibilityPrinciple {
	public static void main(String[] args) {
		
	}
}
