// Practice of IF ELSE for the Login Example.

package condtitional;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		String user = "Chandu";
		String password = "Advi";
			
		
		Scanner sc = new Scanner(System.in);
		String username =sc.nextLine();
		String pass = sc.nextLine();
		
		if(username.equals(user)) {
			if(pass.equals(password)) {
				System.out.println("Login Successful"+'\n');
				System.out.println("            WELCOME          ");
								
			}
		}
		
		
		else {
			System.out.println("Invalid Username or Password");
		}
		
		
		
				
	}

}
