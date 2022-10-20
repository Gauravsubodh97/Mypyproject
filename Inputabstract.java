abstract class Shape
{
	abstract void area(float Input);
}
class Square extends Shape
{
	void area(float Input)
	{
		float Area = Input * Input;
		System.out.println(Area);
	}
}
/*class Rectangle extends Shape
{
	void area(float Input)
	{
		
		float Area = Input *Input;
		System.out.println(Area);
	}
}*/
class Circle extends Shape
{
	void area(float Input)
	{
		float pi = 3.14f;
		float Area = pi*Input*Input;
		System.out.println(Area);
	}
	public static void main(String args[])
	{
		Square s1 = new Square();
		s1.area(10);
		Circle c1 = new Circle();
		c1.area(12);
	}
		
}

		