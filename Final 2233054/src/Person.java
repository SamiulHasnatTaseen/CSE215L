
public abstract class Person {
	//Variables
	private String Name;
	private int PhoneNumber;
	//Default Constructor
	public Person(){
		
	}
	//Parameterized Constructor
	public Person(String Name,int PhoneNumber){
		this.Name = Name;
		this.PhoneNumber = PhoneNumber;
	}
	//getter
	public String getName() {
		return Name;
	}
	public int getPhoneNumber() {
		return PhoneNumber;
	}
	//setter
	public void setName(String Name){
		this.Name = Name;
	}
	public void setPhoneNumber(int PhoneNumber){
		this.PhoneNumber = PhoneNumber;
	}
	//toString
	public String toString() {
		return "Name: "+Name+"Phone Number: "+PhoneNumber;
	}
	//Abstract Method
	public abstract double PurchaseParkingPass();
}

