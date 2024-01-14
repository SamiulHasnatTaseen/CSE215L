
public class Student extends Person{
private int StudentNumber;
private int Age;
private String Department;
public Student() {
	
}
public Student(String Name,int PhoneNumber,int StudentNumber,int Age,String Department){
	super(Name,PhoneNumber);
	this.setStudentNumber(StudentNumber);
	this.Age=Age;
	this.Department=Department;
}

public boolean IsEligibleToEnroll(int Age) {
	if(Age>=18) {
	return true;
	}else {
		return false;
	}
}
public int getStudentNumber() {
	return StudentNumber;
}
public void setStudentNumber(int studentNumber) {
	StudentNumber = studentNumber;
}
public int getAge() {
	return Age;
}
public void setAge(int Age) {
	this.Age = Age;
}
public String getDepartment() {
	return Department;
}
public void setDepartment(String Department) {
	this.Department = Department;
}
@Override
public double PurchaseParkingPass() {
	
	if(IsEligibleToEnroll(Age)) {
	return 70.00;
	}else {
		return 0.00;
	}
}

public String toString() {
	return "Name: "+getName()+" Phone Number: "+getPhoneNumber()+" Student Number: "+getStudentNumber()+" Age: "+Age+" Department: "+Department;
}

}
