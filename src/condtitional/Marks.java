// Practice of IF ELSE and ELse if using the marks and Grades.

package condtitional;


import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int marks = sc.nextInt();
	if(marks >= 90) {
		System.out.println("Grade A");
			}
	else if(marks >= 70) {
		System.out.println("Garade B");
		
	}
	else if(marks >= 40) {
		System.out.println("Grade C");
	}
	else {
		System.out.println("Fail");
	}

	}

}
