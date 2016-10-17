class QueuedArray
{
	int ary[]= new int[50];
	static int head=0;
	static int tail=0;
	
/*	public StackedArray(int arr[])
	{
		for(int i=0; i<arr.length;i++)
		{
			ary[1][i]= arr[i];
			head=i;
		}
	}*/
	
	void push(int value)
	{
		this.ary[head]=value;
		head=head+1;
	}
	
	void pop()
	{
		this.ary[tail]=0;
		tail++;
	}
	
	void print()
	{
		for(int i=tail; i<=head-1;i++)
		{
			System.out.println(this.ary[i]);
		}
	}
	
	public static void main(String args[])
	{
		QueuedArray sc= new QueuedArray(/*arr*/);
		sc.push(10);
		sc.print();
		System.out.println("**********************************");
		sc.push(20);
		sc.print();
		System.out.println("**********************************");
		sc.push(30);
		sc.print();
		System.out.println("**********************************");
		sc.pop();
		sc.print();
		System.out.println("**********************************");
		sc.push(40);
		sc.print();
		System.out.println("**********************************");
	}
}