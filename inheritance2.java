class Parent1
{
 void show()
   {
     System.out.println("hello i am Parent");
	 }
}
class Child2 extends Parent1
{
 void show2()
  {
    System.out.println("hello i am a child");
	}
}

class Test
{
 public static void main(String args[])
  {
   Parent1 P1 = new Parent1();
   P1.show();
   Child2 C2 = new Child2();
   C2.show2();
   C2.show2();
   }
 }