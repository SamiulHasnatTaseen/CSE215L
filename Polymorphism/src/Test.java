abstract class  Shape{
	private String color;
	public Shape() {
		
	}
	public Shape(String color) {
		this.color=color;
	}
	public void printInfo() {
		System.out.println(color);
	}
	abstract void show();
}
class Circle extends Shape{
	private double radius;
	public Circle(String color,double radius) {
		super(color);
		this.radius=radius;
	}
	public double area() {
		return 3.1416*radius*radius;
	}
	void show() {
		System.out.println("This is a circle");
	}
}
class Rectangle extends Shape{
	private double length,width;
	public Rectangle(String color,double length,double width) {
		super(color);
		this.length=length;
		this.width=width;
	}
	public double area() {
		return length*width;
	}
	void show() {
		System.out.println("This is a Rectangle");
	}
}
public class Test {

	public static void main(String[] args) {
		Circle obj=new Circle("DD",2);
		System.out.println(obj.area());
		obj.printInfo();
		Rectangle objs=new Rectangle("YY",2,9);
		System.out.println(objs.area());
		objs.printInfo();
	}

}
