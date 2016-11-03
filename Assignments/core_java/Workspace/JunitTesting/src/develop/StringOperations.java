package develop;

public class StringOperations {

	static String sb= new String();
	static String sb2= new String();
	public String Concat(String s1, String s2)
	{
//		for(int i=0; i<s1.length(); i++)
//		{
//			sb.append(s1.charAt(i));
//		}
//		for(int i=0; i<s2.length(); i++)
//		{
//			sb.append(s2.charAt(i));
//		}
		
//		sb=s1;
//		sb2=s2;
		
//		return sb.concat(sb2);
		return s1.concat(s2);
	}
	public char getCharacter(int index)
	{	
		String sb3="HelloWorld";
		return sb3.charAt(index);
	}
	public int getLength()
	{
		sb="HelloWorld";
		return sb.length();
	}
}