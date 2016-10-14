import java.util.Scanner;

class A8
{
	public static void main(String args [])
	{
		Scanner s= new Scanner(System.in);
		int t=3;
		String def="archit123";
		while(t>0)
		{
			t=t-1;
			System.out.print("Please input your password : ");
			String pwd = s.next();
			if(def.equals(pwd))
			{
				System.out.println(" ! ! Welcome ! !");
				break;
			}
			else
			{
				System.out.println(" ! ! ! ! WRONG PASSWORD ! ! ! !");
			}
		}
		if(t==0)
		{
			System.out.print("contact Admin");
		}
	}
}