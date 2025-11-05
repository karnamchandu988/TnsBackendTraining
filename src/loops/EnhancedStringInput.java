package loops;

import java.util.Scanner;

public class EnhancedStringInput {


		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("Enter the Studnet Scores: ");
			
			String input = sc.nextLine();
			String[] size = input.split(" ");
			
			int[] num = new int[size.length];
			
			
			
			for(int i  = 0; i<num.length;i++) {
				 num[i] = Integer.parseInt(size[i]);
				
			}
			
			
			int sum = 0;
			
			for(int x : num) {
				
				sum += x;			
			}
			System.out.println("The Average of Total Class is: "+(sum/size.length));
			
			
			
			
			

		}

	}
