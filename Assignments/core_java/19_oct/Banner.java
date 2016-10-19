class Banner
{
		static int i=0;
	public static void main(String[] args) throws Exception {
		StringBuilder s= new StringBuilder("**Welcome to Java** ");
		while(true)
		{
			if (i>=s.length()) {
				i=0;
			}
			else
			{
				System.out.print("\r"+s.substring(i, s.length()));
				System.out.print(s.substring(0,i));
				Thread.sleep(100);
				i++;
			}
			
		}
	}
}