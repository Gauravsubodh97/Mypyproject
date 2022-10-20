//construture with Paremeter//
abstract class Parent
{
	int id;
	String name;
	
	Parent(int id ,String name)
	{
		this.id= id;
		this.name= name;
	}
	
	void show()
	{
		System.out.println(this.id+this.name);
	}
}

class Child extends Parent
{
	Child()
	{
		super(56,"eight");
		System.out.println("Java");
	}
	
	/*void show1()
	{
		
	}*/
}

class Test
{
	public static void main(String args[])
	{
	
	Child a1 = new Child();
	a1.show();
	//a1.show1();
	}
}

	