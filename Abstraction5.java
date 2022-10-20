abstract class Parent
{
	int id;
	String name;
	
	Parent()
	{
		id = 1;
		name ="Guarav";
	}
	void  display()
	{
		System.out.println(id+name);
	}
}
class Child extends Parent
{
	void show1()
	{
	System.out.println("hello");
	}
	
}

class Test3
{
	public static void main(String args[])
	{
	Child a1 = new Child();
	a1.show1();
	a1.display();
	
	}
}

