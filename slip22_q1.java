package java_Slips;

abstract class Shape{
    protected int length;
    protected int width;

    Shape(int length , int width){
        this.length = length;
        this.width = width;
    }

    public abstract void printArea();
}

class Rectangle extends Shape{

    Rectangle(int length , int width){
        super(length , width);
    }

    public void printArea(){
        int area = length * width;
        System.out.println("Area of Rectangle is : " + area);
    }
}

class Triangle extends Shape{
    Triangle(int length , int width){
        super(length , width);
    }

    public void printArea(){
        double area = (0.5 * (length * width));
        System.out.println("Area of Triangle is " + area);
    }
}

class circle extends Shape{
    circle(int length){
        super(length,0);
    }
    public void printArea(){
        double area = Math.PI * length * length;
        System.out.println("Area if of the Circle " + area);
    }
}


public class slip22_q1 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5,6);
        Triangle t = new Triangle(5,6);
        circle c = new circle(5);

        r.printArea();
        t.printArea();
        c.printArea();
    }
}
