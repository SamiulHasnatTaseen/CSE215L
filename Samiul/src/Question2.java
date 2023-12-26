class Employee{
	private String name,address;
	private int yoj,salary;
	
	//default constructor
	Employee(){
		
	}
	//parameterized constructor
	Employee(String name,String address,int yoj,int salary){
		this.setName(name);
		this.setAddress(address);
		this.setYoj(yoj);
		this.setSalary(salary);
	}
	
	//setter
	void setName(String name) {
		this.name=name;
	}
	void setAddress(String address) {
		this.address=address;
	}
	void setSalary(int salary) {
		this.salary=salary;
	}
	void setYoj(int yoj) {
		this.yoj=yoj;
	}
	
	
	//getter
	public String getName() {
		return name;
	}
	public int getYoj() {
		return yoj;
	}
	public int getSalary() {
		return salary;
	}
	public String getAddress() {
		return address;
	}
	
	//getInfo method - method overloading
	public String getInfo(String name, int ypj) {
		
		return "Name: "+name+" year of joining: "+getYoj();
	}
	
	public String getInfo(int salary,String address) {
		
		return "salary: "+salary+" address: "+address;
	}
	public int AddSal(int salary) {
		if (salary<500) {
			return (salary+=1000);
		}else {
			System.out.println("Salary is more than 500tk");
			return salary;
		}
		
	}
	
	
}
public class Question2 {

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		e2.setName("Samiul");
		e2.setSalary(400);
		e2.setYoj(2023);
		e2.setAddress("Dhaka");
	
		e1.getInfo(e1.getName(),e1.getYoj());
		e1.getInfo(e1.getSalary(),e1.getAddress());
		e2.getInfo(e2.getName(),e2.getYoj());
		e2.getInfo(e2.getSalary(),e2.getAddress());
		
		e1.AddSal(e1.getSalary());
		e2.AddSal(e2.getSalary());
	}

}
