//multilevel inheritance//
class Grandparent
{
 void show()
 {
  System.out.println("hello i am Grandparent");
  }
 }
 
 class Parent extends Grandparent
 {
  void show2()
  {
   System.out.println("hello i am parent");
   }
 }
 
 class Child extends Parent
 {
  void show3()
  {
    System.out.println("hello i am child");
	}
}

class Test
{
 public static void main(String args[])
 {
 Grandparent a1 = new Grandparent();
 a1.show();
 
 Parent b1 = new Parent();
 b1.show2();
 b1.show();
 
 Child c1 = new Child();
 c1.show3();
 c1.show();
 c1.show2();
 }
}

 