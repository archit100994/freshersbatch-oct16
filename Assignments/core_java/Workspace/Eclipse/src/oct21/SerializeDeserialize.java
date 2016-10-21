package oct21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import oct20.InsufficientBalanceException;

class Account implements Serializable
{
	/*transient*/ int principle;
	Date dob;
	
	private static final long serialVersionUID = 151l;
	
	public Account(int sum, Date dob)
	{
		this.principle=sum;
		this.dob=dob;
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
	
	public String toString()
	{
		return("Current balance is: "+ principle +" " +dob.showDate());
	}
}





@SuppressWarnings("serial")
class Date implements Serializable
{
	int date;
	int month;
	int year;
	
	public Date()
	{
		this.date=10;
		this.month=9;
		this.year=1994;
		
		//System.out.println(this.date + ", " + this.month + ", " + this.year);
	}
	
	public Date(int date, int month, int year)
	{
		this.date=date;
		this.month=month;
		this.year=year;
		
		System.out.println(this.date + ", " + this.month + ", " + this.year);
	}	
	
	public String showDate()
	{
		return ("Today's Date is: " + date);
	}
	
	void showMonth()
	{
		System.out.println("This month is: " + date);
	}
	
	void showYear()
	{
		System.out.println("This year is: " + date);
	}
	
	void swapDate(int date)
	{
		int temp;
		temp=date;
		date=this.date;
		this.date=temp;
	}
}





public class SerializeDeserialize {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File file= new File("a5.txt");
		FileOutputStream fos= new FileOutputStream(file);
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		
		oos.writeObject(new Account(15000, new Date()));
		
		oos.flush();
		
		
		FileInputStream fin = new FileInputStream(file);
		ObjectInputStream in = new ObjectInputStream(fin);
		Account acc = (Account)in.readObject();
		System.out.println("Account = " + acc);
		
		oos.close();
		fos.close();
		
		fin.close();
		in.close();
		
		
		
		

	}

}
