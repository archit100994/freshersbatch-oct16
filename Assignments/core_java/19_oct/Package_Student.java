package stud;
import fact.Package_Faculty;
public class Package_Student
{
	int marks;
	int roll;

	public Package_Student(int roll, int marks)
	{
		this.marks=marks;
		this.roll=roll;
	}

	public void show(int roll)
	{
		System.out.println(Package_Faculty.getStudentMarks(this.roll));
	}

}