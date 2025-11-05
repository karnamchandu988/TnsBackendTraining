// Practice of the While loop and taking a example of reversing a number

package loops;

import java.util.Scanner;


public class WhileLoop {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int rev = 0;
		while(n>0) {           
			int digit = n % 10;  // taking out the last digit by using mod
			rev = rev*10+digit;  // now multiplying the last digit with 10 and adding the new digit
			n /= 10;			 // now just dividing the new updated n value with 10 to remove the last digit
			
		}
		System.out.println(rev);
		

	}

}
