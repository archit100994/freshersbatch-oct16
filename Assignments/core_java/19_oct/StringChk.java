class StringChk
{
	public static void main(String[] args) {
		String s= "ABC";
		String s1 = new String("ABC");

		if (s==s1)
		{
			System.out.println("Same on using == operator");
		}
		else
		{
			System.out.println("Different on using == operator");
		}

		if (s.equals(s1))
		{
			System.out.println("Same on using EQUALS function");
		}
		else
		{
			System.out.println("Different on using EQUALS function");
		}
	}
}