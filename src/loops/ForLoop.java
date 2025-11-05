// Practice for the for loops and Created the Methods



package loops;

public class ForLoop {

	
	// Method for the Even number
	
	public void even(int n) {
		if(n % 2 == 0) {
			System.out.print(n+" ");
		}
	}

	
	
	// Method for the Odd number
	
	public void odd(int n) {
		if(n % 2 != 0) {
			System.out.print(n+" ");
		}
		
	}
	
	// Method for the Prime Numbers
	
	public void prime(int n) {
		boolean isPrime=true;
		
		if(n<2)
			return;
		
		
		for(int i =2;i<=n/2;i++) {
			
			if(n%i == 0) {
				isPrime = false;
				break;
			}
			}
		if(isPrime)
			
			System.out.print(n+" ");		
	}
	
	
	
	
	
}