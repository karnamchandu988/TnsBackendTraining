// Practing the Enhanced For Loop with the Normal Type of Input using the For loop scanning.

package loops;

import java.util.Scanner;


public class EnhancedForLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of Students: ");
		
		int studentcount = sc.nextInt();
		
		System.out.println();
		
		int[] num = new int[studentcount];
		
		System.out.println("Enter the Studnet Scores: ");
		
		
		for(int i  = 0; i<num.length;i++) {
			num[i] = sc.nextInt();
			
		}
		
		
		//Taking the avereage of the input elements of the array
		
		int sum = 0;
		
		for(int x : num) {
			
			sum += x;			
		}
		System.out.println("The Average of Total Class is: "+(sum/studentcount));
		
		
		
		
		

	}

}
