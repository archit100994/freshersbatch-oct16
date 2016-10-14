class A3
{
	public static void main(String args[])
	{
		int temp;
		int arr[]=new int[args.length];
		
		for(int i=0; i<args.length; i++)
		{
			arr[i]=Integer.parseInt(args[i]);
		}
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=1; j<arr.length; j++)
			{
				if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
					arr[j-1] = arr[j];  
                    arr[j] = temp;
					}
			}
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}