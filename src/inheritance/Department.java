package inheritance;

public class Department extends College {
	
	public String departmentName;
	

	Department(String u, String c, String d) {
		super(u, c);
		
		departmentName = d;
	}
	
	
	void showDepartment() {
		
		System.out.println("Department: "+ departmentName);
	}

}
