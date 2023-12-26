
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj = new Rectangle("Green",5.0,5.0);
		System.out.println(obj);
		System.out.println(obj.calculateArea(5.0,5.0));
		Circle obC = new Circle("Teal",3);
		System.out.println(obC);
		System.out.println(obC.calculateArea(3));
	}

}
