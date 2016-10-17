class Date
{
	int date;
	int month;
	int year;
	
	public Date()
	{
		this.date=10;
		this.month=9;
		this.year=1994;
		
		System.out.println(this.date + ", " + this.month + ", " + this.year);
	}
	
	public Date(int date, int month, int year)
	{
		this.date=date;
		this.month=month;
		this.year=year;
		
		System.out.println(this.date + ", " + this.month + ", " + this.year);
	}	
	
	void showDate()
	{
		System.out.println("Today's Date is: " + date);
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
	
	public static void main(String args[])
	{
		Date d1= new Date();
		Date d2= new Date(17, 4, 1999);
		d2.swapDate(25);
		d2.showDate();
	}
}