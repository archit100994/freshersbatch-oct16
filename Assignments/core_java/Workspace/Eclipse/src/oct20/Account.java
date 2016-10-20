package oct20;

class Account
{
	int principle;
	
	public Account(int sum)
	{
		this.principle=sum;
	}
	
	void deposit(int amount)
	{
		this.principle= this.principle+amount;
	}
	
	void withdraw(int amount) throws InsufficientBalanceException
	{
		if(this.principle < amount)
			throw new InsufficientBalanceException("Insufficient Funds!! remaining funds is: " + this.principle);		
		this.principle= this.principle-amount;
	}
	
	void print()
	{
		System.out.println("Current balance is; "+ principle);
	}
	
	public static void main(String args[])
	{
		Account a= new Account(0);
		a.print();
		a.deposit(100);
		a.print();
		try {
			a.withdraw(25);
			
			a.withdraw(1000);
			
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a.print();
	}
}