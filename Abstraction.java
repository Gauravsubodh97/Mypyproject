/*The term abstraction means incomplete we can not creat the object of a abstract class,
in an abstract class we can have abstract method as well as non abstract method, abstract method 
are those method which have no body.
if there exist atleast one abstract method in a class then 
class must be declaid as a abstract class.
we also have a abstract class without abstract method.
abstraction classs is used to make inheritace complasory.
example:-*/

abstract class Parent
{
	int a ;
	String id;
	void setdata(int a, String id)
	{
		this.id = id;
		this.a= a;
		System.out.println("Gaurav",2);
	}
}
abstract class Child extends Parent
{
	public static void main()
	{
		Child a1 = new Child();
		//a1.setdata();
		
	}
}