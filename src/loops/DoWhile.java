// Practicing the Do while loop by taking a even number printing as a example

package loops;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		int i = 2;
		int b=sc.nextInt();
		
		
		do {
			System.out.print(i+" ");
			i += 2;
			
		}while(i <= b);
		
		
		
	}

}
