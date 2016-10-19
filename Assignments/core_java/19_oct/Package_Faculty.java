package fact;

public class Package_Faculty
{
	int roll_no;
	public Package_Faculty(int roll_no)
	{
		this.roll_no=roll_no;
	}
	
	public static int getStudentMarks(int roll_no)
	{
		return roll_no*10;
	}

	//System.out.println( " " + marks);
}