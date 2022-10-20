import java.util.Scanner;
class Shape
{
 public static void main(String args[])
 {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Input the integer value : ");
	 int num= sc.nextInt();
	 
	 System.out.println("Input the Float value : ");
	 float flo =sc.nextFloat();
	 
	 System.out.println("Input the String value : ");
	 String s = sc.next();
	 
	 System.out.println("Input the Character value : ");
	 char c = sc.next().charAt(0);
	 
	 System.out.println(num);
	 System.out.println(flo);
	 System.out.println(s);
	 System.out.println(c);
 }
 
}
