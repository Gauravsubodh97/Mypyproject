//inheritance (single)//
class Parent
{
	void show()
	{
		System.out.println("hello i am Parent");
	}
}
class Child extends Parent
{
	void show2()
	{
		System.out.println("hello i am a Child");
	}
}
class Test
{
	public static void main(String args[])
	{
		Parent P1 = new Parent();
		P1.show();
		Child C2 = new Child();
		C2.show();
		C2.show2();
	}
}
	
	
	