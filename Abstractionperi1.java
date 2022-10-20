//inheritance though constructor//
abstract class Parent
{
	int id; 
	String name;	
	Parent(int id ,String name )
	{
		this.id = id;
		this.name= name;
	}
	void show()
	{
		System.out.println(id+name);
	}
	/*Parent()
	{
	}*/
}
class Child extends Parent
{
	Child()
	{
		super(12,"yyyuuu");
		System.out.println("java");
	}
}
class Test
{
	public static void main(String args[])
	{
		Child a1 = new Child();
		a1.show();
	}
}