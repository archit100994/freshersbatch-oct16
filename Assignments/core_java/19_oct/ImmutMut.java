class ImmutMut
{
	public static void main(String[] args) {
		String s= new String("Archit");
		String s2=s;
		s=s+" Jain";

		System.out.println(s);
		System.out.println(s2);

		StringBuilder sb= new StringBuilder("Hello");
		sb.append(" world");
		System.out.println(sb);
	}
}