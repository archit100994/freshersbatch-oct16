class A7_arm_range
{
	public static void main(String args [])
	{
		for(int i=100; i<1000; i++)
		{
			int n=i;
			int a, c=0;
			int temp=n;  
		
			while(n>0)  
			{  
				a=n%10;  
				n=n/10;  
				c=c+(a*a*a);  
			}  
		
			if(temp==c)  
				System.out.println("armstrong number : "+ temp);   
		}
	}
}