// Main class of the States, Capitals and Districts
package ClassesObjects;

public class StateMain {

	public static void main(String[] args) {
		
		StatesInIndia s=new StatesInIndia();
		s.name = "Andhra Pradesh";
		s.capital = "Amaravathi";
		s.districts = 29; 
		s.print();
		System.out.println();
		StatesInIndia s1=new StatesInIndia();
		s1.name = "Telangana";
		s1.capital = "Hyderabad";
		s1.districts = 31; 
		s1.print();
		System.out.println();
		
		StatesInIndia s2=new StatesInIndia();
		s2.name = "Maharastra";
		s2.capital = "Mumbai";
		s2.districts = 43; 
		s2.print();
		
			
	}

}
