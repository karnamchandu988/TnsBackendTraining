// Switch Case for the Arthamatic Operations.

package condtitional;
import java.util.Scanner;

public class SwitchCal {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the 1st num: ");  
		int a = sc.nextInt();
		System.out.print("Enter the 2nd num: ");  
		int b = sc.nextInt();
		
		if(b == 0) {
			System.out.println("Enter a Valid 2nd Number");
		}
		else {
		System.out.println();
		
		System.out.println("\n1. Add\n2. Sub\n3. Mul\n4. Div\n");

		
				
		System.out.println("Choose a Operation: ");
		
		int opt = sc.nextInt();
		
		
		
		switch(opt){
		
		case 1:
			System.out.println("Addition = "+(a+b));
			break;
		case 2:
			System.out.println("Subtraction = "+(a-b));
			break;
		case 3:
			System.out.println("Multiplication = "+(a*b));
			break;
			
		case 4:
			System.out.println("Division = "+(a/b));
			break;
		
		default:
			System.out.println("Invalid Operation Enter the Number between 1 to 4");
					
		
		}
		
		}
			
		

	}

}
