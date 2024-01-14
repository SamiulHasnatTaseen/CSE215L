
public class Professor extends Person{
private double Salary;
public Professor() {
	
}
public Professor(String Name,int PhoneNumber,double Salary){
	super(Name,PhoneNumber);
	this.Salary=Salary;
}
public double getSalary() {
	return Salary;
}
public void setSalary(double Salary) {
	this.Salary = Salary;
}
@Override
public double PurchaseParkingPass() {
	
	if(Salary>50000) {
	return Salary*0.02;
	}else {
		return 500.00;
	}
}
public String toString() {
	return "Name: "+getName()+" Phone Number: "+getPhoneNumber()+" Salary: "+Salary;
}

}
