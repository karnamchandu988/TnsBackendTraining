package inheritance;

public class UnviersityMain {

	public static void main(String[] args) {

		Department x= new Department("JNTUH", "AVNIET", "ECE");
		
		x.showUniveristy();
		x.showCollege();
		x.showDepartment();
		
		System.out.println();
		
		Department z = new Department("AUTONOMOUS", "AVNIET", "AIML");
		z.showUniveristy();
		z.showCollege();
		z.showDepartment();
		
	}

}
