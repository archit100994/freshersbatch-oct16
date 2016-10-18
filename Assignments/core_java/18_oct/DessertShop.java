import java.util.Scanner;

abstract class DessertItem
{
	abstract int getCost();
}

class Candy extends DessertItem
{
	private int stock=0;
	private double tax=15;
	private String name;
	private int price;
	
	public Candy(String name, int price, int amt)
	{
		this.name=name;
		this.price=(price*60);
		this.stock=this.stock+amt;
	}
	
	int getCost()
	{
		return 0;
	}
}

class Cookie extends DessertItem
{
	private int stock=0;
	private double tax=12;
	private String name;
	private int price;
	
	public Cookie(String name, int price, int amt)
	{
		this.name=name;
		this.price=(price*70);
		this.stock=this.stock+amt;
	}
	
	int getCost()
	{
		return 0;
	}
}

class IceCream extends DessertItem
{
	private int stock=0;
	private double tax=10;
	private String name;
	private int price;
	
	public IceCream(String name, int price, int amt)
	{
		this.name=name;
		this.price=(price*60);
		this.stock=this.stock+amt;
	}
	
	int getCost()
	{
		return 0;
	}
}


public class DessertShop
{
	public static void main(String args[])
	{
		int ch;
		String s= new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("***Welcome to the Dessert Shop***");
			
		//void firse()
		//{
			do
			{
				//la:
				System.out.println("Please Select Your Role: (1 / 2)");
				System.out.println("1. Owner");
				System.out.println("2. Customer");
				ch=Integer.parseInt(sc.next());

				switch (ch)
				{
					case 1:
						System.out.println("welcome owner");
						int j=0;
					
					
						while(j==0)
						{
							System.out.println("What will you like to update (1 / 2 / 3)");
							System.out.println("1. Candy");
							System.out.println("2. Cookie");
							System.out.println("3. IceCream");
							ch=sc.nextInt();
							
							switch (ch)
							{
								case 1:
									j=1;
									break;
								
								case 2:
									j=1;
									break;
								
								case 3:
									j=1;
									break;
								
								default:
									System.out.println("  !!!  Wrong input. Please try again  !!!   ");
							}
						}	
						
						break;
		
					case 2:
		
						break;
		
					default:
						System.out.println("  !!!  Wrong input. Please try again  !!!   ");
						
				}
	
				System.out.println("Would you like to continue: (Y / N)");
				s=sc.next();
						
			}while(s.equalsIgnoreCase("Y"));
		//}
	}
}