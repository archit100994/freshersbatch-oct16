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
	
	void withdraw(int amount)
	{
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
		a.withdraw(25);
		a.print();
	}
}