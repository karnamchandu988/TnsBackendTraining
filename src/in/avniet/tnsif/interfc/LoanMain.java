// Interface Main body for Loans

package in.avniet.tnsif.interfc;
import java.util.Scanner;

public class LoanMain {

	public static void main(String[] args) {
		

		Loans lo= new LoanImp();
		Scanner sc=new Scanner(System.in);
		
		int choice; // int for the choosing the option.
		do {
		    lo.Greet(); // Greeting msg
		    Loans.options(); // Options Display
		    choice = sc.nextInt(); // Options scanner inp

		    switch(choice) {  // Usign New switch Case for the multiple cases
		        case 0 -> {
		            System.out.print("Enter the Credit Amount: ");
		            int credit = sc.nextInt();
		            lo.Credit(credit);
		        }
		        case 1 -> {
		            System.out.print("Enter the Debit Amount: ");
		            int debit = sc.nextInt();
		            lo.Debit(debit);
		        }
		        case 2 -> lo.bal();
		        case 3 -> System.out.println("Thank you! Visit again!");
		        default -> System.err.println("Invalid Option!");
		    }
		    System.out.println("----------------------------\n");
		} while (choice != 3);  // for the false condition(exit) the loop is exited and back to run again.

		
				
	}

}
