
abstract class Parent
{ 
  int a;
  String name;
  Parent()
  {
	  a = 23;
	  name = "Gaurav";
  }
}
class Child extends Parent
{
	void show()
	{
		System.out.println("hello");
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
	  
	