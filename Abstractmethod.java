abstract class Parent
{
 abstract void show();
}
class Child extends Parent
{
	void show()
	{
		System.out.println("Gaurav rttysd");
	}
	public static void main(String args[])
	{
		Child a1= new Child();
		a1.show();
	}
}