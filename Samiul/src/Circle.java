
public class Circle extends Shape{
	private double radius;
	public Circle(){
		super();
	}
	public Circle(String color,double radius){
		super(color);
		this.radius=radius;
		
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double calculateArea(double radius) {
		return (radius*radius*3.14159);
	}
	
	@Override
	public String toString() {
		return super.toString()+ " and the radius is: "+ radius;
	}
}
