class Parent
{
   Parent()
   {
    System.out.println("i am Parent class Constructor");
	}
}
class Child extends Parent
{
   Child()
   {
     System.out.println("i am child class Constructor");
	 }
}
class Test
{
 public static void main(String args[])
 {
  Child a1 = new Child();
  }
}