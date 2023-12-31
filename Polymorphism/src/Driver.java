class Bank{
	private String name;
	private String location;
	private int code;
	private double transaction;
	public Bank() {
		
	}
	public Bank(String name,String location,int code,double transaction) {
		this.name=name;
		this.location=location;
		this.code=code;
		this.transaction=transaction;
	}
	public String toString() {
		return "The details of the bank is: Name: "+name+" Location: "+location+" Code: "+code;
	}
	public double interest() {
		return 0;
	}
	public double getTransaction() {
		return transaction;
	}
};
class CityBank extends Bank{
	public CityBank() {
		super();
	}
	public CityBank(String name,String location,int code,double transaction) {
		super( name, location, code,transaction);
	}
	public String toString() {
		return super.toString();
	}
	public double interest() {
		if (getTransaction()>100000) {
			return (getTransaction()*.10);
		}
		else {
			return getTransaction();
		}
	}
}
class CityAlo extends CityBank{
	
}
class UCBBank extends Bank{
	private String branch;
	public UCBBank() {
		super();
	}
	public UCBBank(String name,String location,int code, String branch,double transaction) {
		super(name,location,code,transaction);
		this.branch=branch;
	}
	public String toString() {
		return super.toString()+" Branch Name: "+branch;
	}
	public double interest() {
		if (getTransaction()>100) {
			return (getTransaction()*.02);
		}
		else {
			return getTransaction();
		}
	}
}
public class Driver {
	public static void main(String[] args) {
		System.out.println("Hello");
		CityBank obj1 = new CityBank("City Bank","Gulshan",123,56400);
		System.out.println(obj1);
		System.out.println(obj1.interest());
		UCBBank obj2 = new UCBBank("UCB Bank","Bashundhara",705,"Centennial",470);
		System.out.println(obj2);
		System.out.println(obj2.interest());
	}
}