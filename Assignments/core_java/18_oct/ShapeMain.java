abstract class Shape
{
	abstract void draw();
}

class Line extends Shape
{
	public Line()
	{
		draw();
	}
	void draw()
	{
		System.out.println("Line is drawn");
	}
}

class Rectangle extends Shape
{
	public Rectangle()
	{
		draw();
	}
	
	void draw()
	{
		System.out.println("Rectangle is drawn");
	}
}

class Cube extends Shape
{
	public Cube()
	{
		draw();
	}
	
	void draw()
	{
		System.out.println("Cube is drawn");
	}
}

public class ShapeMain
{
	public static void main(String args[])
	{
		Shape s[] = new Shape[3];
		s[0]= new Line();
		s[1]= new Rectangle();
		s[2]= new Cube();
	}
}