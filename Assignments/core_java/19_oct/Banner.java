class Banner
{
	public static void main(String[] args) throws Exception {
		String s= new String("welcome to Java");
		while(true){
			for(int i=0; i<s.length(); i++)
			{
				System.out.print(s.substring(i+1, s.length()));
				System.out.println(s.substring(0,i));
				Thread.sleep(1000);
			}
		}
	}
}