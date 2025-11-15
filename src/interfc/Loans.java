// Practice for Interface

package interfc;

public interface Loans {
	
	// Abstract methods in Interface

	void Credit(int amt);
	void Debit(int amt);
	void bal();
	
	// Default Methods
	
	default void Greet() {
		System.out.println("Welcome to the ATM");
		
	}
	
	
	//Static Method
	
	static void options() {
		System.out.println("Select the Option:\n0. Credit\n1. Debit\n2. Current Balance\n3. Exit");
		
		}
	
	// Variables
	
	final int CREDIT_LMT = 50000;
	int DEBIT_LMT = 100000;
	
	
	
	
	
	
	
	
}
