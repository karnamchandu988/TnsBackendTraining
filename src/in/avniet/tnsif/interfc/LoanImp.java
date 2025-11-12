// Interface Implementation for Loans 


package in.avniet.tnsif.interfc;

public class LoanImp implements Loans {
	 double balance = 60000;

	@Override
	public void Credit(int amt) {
		if(amt<=CREDIT_LMT) {
			balance += amt;
			System.out.println("Credited: "+ amt + ". Current Balance: "+ balance);
			
		}
		else {
			System.err.println("Credit Limit excedded! (Max Amount is:"+CREDIT_LMT+")");
			System.out.println("Current Balance: "+balance);
		}
	}
	
	

	@Override
	public void Debit(int amt) {
		if(amt<=DEBIT_LMT && amt <= balance) {
			balance -= amt;
			System.out.println("Debited: "+amt+". Current Balance: "+balance);
			
		}
		else {
			System.err.println("Debit Failed! Check Limits or Balance.");
			System.out.println("Current balance:"+balance);
		}
	}



	@Override
	public void bal() {		
		System.out.println("Current Balance: "+balance);
						
	}
	

}
