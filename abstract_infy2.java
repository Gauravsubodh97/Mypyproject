
abstract class Shape{
    double length;
    double width;
    public Shape(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public abstract void draw();
    public double getArea() {
        return length*width;
    }
    
}
class Rectangle extends Shape{
    public Rectangle(double length,double width) {
        super(length,width);    
    }
    public void draw() {
        System.out.println("Create Rectangle");
    }
}
public class Infy {
    public static void main(String[] args) {
    Shape rect=new Rectangle(20,30);
    rect.draw();
    System.out.println("Area of Rectangle is:"+rect.getArea());
    }
}