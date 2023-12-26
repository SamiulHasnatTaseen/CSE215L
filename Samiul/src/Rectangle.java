
public class Rectangle extends Shape{
	private double length,width;
	public Rectangle(){
		super();
	}
	public Rectangle(String color,double length,double width){
		super(color);
		this.length=length;
		this.width=width;
	}
	public void setLength(double length) {
		this.length=length;
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public double calculateArea(double length,double width) {
		return length*width;
	}
	
	@Override
	public String toString() {
		return super.toString()+ " The length is: "+ length+ " The width is: "+ width;
	}
}
