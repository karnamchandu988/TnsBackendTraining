package in.avniet.tns.inheritance;

public class College extends University {
	
	public String collegeName;
	

	College(String u, String c) {
		super(u);
		
		collegeName = c;
		
	}

	void showCollege() {
		System.out.println("College Name: "+collegeName);
	}
}
