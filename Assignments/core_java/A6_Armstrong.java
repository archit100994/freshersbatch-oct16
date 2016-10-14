class A6_Armstrong
{
	public static void main(String args [])
	{
		int a, c=0;
		int n= Integer.parseInt(args[0]);
		
		int temp=n;  
		
		while(n>0)  
		{  
			a=n%10;  
			n=n/10;  
			c=c+(a*a*a);  
		}  
    
		if(temp==c)  
			System.out.println("armstrong number");   
		else  
			System.out.println("Not armstrong number");
	}
}