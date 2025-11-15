package inheritance;

public class University {
	
	public String universityName; // creating a global variable called university Name
	
	University(String u){          // adding a paramaterized constructed for intializing with the university name
		universityName = u;
		
	}
	
	void showUniveristy() {              // just adding a method to print the university Name
		
		System.out.println("University: "+ universityName);
	}

}
