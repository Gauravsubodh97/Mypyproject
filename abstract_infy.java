//abstract
abstract class Bank{
    abstract float roi() ;
}
class cenara extends Bank{
    float roi() {
        return 8.2f;
    }
}
class boi extends Bank{
    float roi() {
        return 7.6f;
    }
}
public class Infy {
    public static void main(String[] args) {
    Bank b=new cenara();
    System.out.println("Rate of interest of cenara bank is:"+b.roi());
    Bank b1=new boi();
    System.out.println("Rate of interest of BOI bank is:"+b1.roi());
    
    }
}