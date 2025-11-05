//FOr loop practice Exectution Class.


package loops;
import java.util.Scanner;


public class ForLoopMain {

	public static void main(String[] args) {
		
		ForLoop x=new ForLoop(); // created a object for the class from main class
		Scanner sc=new Scanner(System.in);
		
		int b = sc.nextInt();//Taking the user input for the end limit
		
		
		// Exextuion for the prime numbers printing
		
		System.out.print("Prime Numbers are: ");
			 		
			for(int i=1;i<=b;i++) {
				
				x.prime(i);
				
			}
			
			System.out.println();
						
			// Exextuion for the Even numbers printing
			
			System.out.print("Even Numbers are: ");
	 		
			for(int i=1;i<=b;i++) {
				
				x.even(i);
				
			}
			System.out.println();
			
			// Exextuion for the Odd numbers printing
			
			System.out.print("Odd Numbers are: ");
	 		
			for(int i=1;i<=b;i++) {
				
				x.odd(i);
				
			}
			
			
			
			
						
		}

	}


