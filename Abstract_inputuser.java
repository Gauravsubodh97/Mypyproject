import java.util.Scanner;
abstract class Shape
{
	abstract void area1();
}
class Square extends Shape
{
	void area1()
	{	
	Scanner sc = new Scanner(System.in);
	System.out.println("Area of Square :-");
	System.out.println("Input Sides : ");
	float Side = sc.nextFloat();
	float area1 = Side * Side;
	System.out.println(area1);

	}
}
class Rectangle extends Shape
{
	void area1()
	{	
	Scanner sc = new Scanner(System.in);
	System.out.println("Area of rechtangle :-");
	System.out.println("Input Length : ");
	float Length = sc.nextFloat();
	System.out.println("Input Bredth : ");
	float Bredth = sc.nextFloat();
	float area1 = Length * Bredth;
	System.out.println(area1);
	}
}
class Circle extends Shape
{
	void area1()
	{	
	Scanner sc = new Scanner(System.in);
	float pi = 3.14f;
	System.out.println("Area of Circle:-");
	System.out.println("Input Radius : ");
	float Radius = sc.nextFloat();
	float area1 = pi* Radius* Radius;
	System.out.println(area1);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Rectangle r1 = new Rectangle();
		r1.area1();
		Square s1 = new Square();
		s1.area1();
		Circle c1 = new Circle();
		c1.area1();
}
}
