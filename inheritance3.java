//inferitance (multi level)//

class Person
{
  void show()
  {
   System.out.println("hello i am parent");
   }
}
class Child extends Person
{
 void show2()
 {
  System.out.println("hello i am child");
  }
}

class Child3 extends Child
{
	void show3()
	{
		System.out.println("hello i am grand child");
	}
}


class Test
{
 public static void main(String srgs[])
 {
  Person P1 = new Person();
  P1.show();
  Child C1 = new Child();
  C1.show();
  C1.show2();
  Child3 C2 = new Child3();
  C1.show();
  C2.show2();
  C2.show3();
  }
 }
  
   