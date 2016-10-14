class A4
{
	public static void main(String args [])
	{
		int sub1=Integer.parseInt(args[0]), sub2=Integer.parseInt(args[1]), sub3=Integer.parseInt(args[2]);
		
		if(sub1>60 && sub2>60 && sub3>60)
		{
			System.out.println("Passed");
		}
		else if((sub1>60 && sub2>60) || (sub3>60 && sub2>60) ||(sub1>60 && sub3>60))
		{
			System.out.println("Promoted");
		}
		else
		{
			System.out.println("Failed");
		}
	}
}