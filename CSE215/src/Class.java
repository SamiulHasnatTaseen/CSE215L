class Student{
	private String name;
	private int id;
	private double cgpa;
	
	//default constructor
	public Student() {
		
	}
	public Student(String n,int uid,double cg){
		this.name=n;
		this.id=uid;
		this.cgpa=cg;
	}
	
	//getter
		public String getName() {
			
			return name;
		}
		public int getId() {
			
			return id;
		}
		public double getCgpa() {
			
			return cgpa;
		}
	
	//setter
		public void setName(String name) {
			this.name=name;
		}
		public void setId(int id) {
			this.id=id;
		}
		public void setCgpa(double cgpa) {
			this.cgpa=cgpa;
		}
}

class Employee{
	private String name;
	private int id;
	private String designation;
	
	//default constructor
	public Employee() {
		
	}
	
	public Employee(String na,int eid,String desig){
		this.name=na;
		this.id=eid;
		this.designation=desig;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getDesignation() {
		return designation;
	}
	
	//setter
	public void setName(String name) {
		this.name=name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setDesignation(String designation) {
		this.designation=designation;
	}
}

class Shape{
	private String name;
	private float length,width;
	private double radius;
	
	//Area calculation method
	double area() {
		return length*width;
		}
	double cirarea(){
		return (3.14159)*radius*radius;
		}
	
	public Shape(String name,float length,float width,double radius){
		this.name=name;
		this.length=length;
		this.width=width;
		this.radius=radius;
	}
	
	//getter
		public String getName() {
			return name;
		}
		public float getLength() {
			return length;
		}
		public float getWidth() {
			return width;
		}
		public double getradius() {
			return radius;
		}
		
		//setter
		/*
		public void setName(String name) {
		
			this.name=name;
		}
		public void setLength(float length) {
			this.length=length;
		}
		public void setWidth(float width) {
			this.width=width;
		}
		public void setRadius(double radius) {
			this.radius=radius;
		}
		*/
		
}

public class Class {

	public static void main(String[] args) {
		
		//System.out.println(null==null); // to check
		
		//Student Object
		Student s1 =new Student("Samiul",2233054,4.00);
		System.out.println(s1.getName() + "   "+ s1.getId()+ " CGPA: "+s1.getCgpa());
		Student s3 =new Student("Hasnat",2233050,3.90);
		System.out.println(s3.getName() + "   "+ s3.getId()+ " CGPA: "+s3.getCgpa());
		Student s4 =new Student("Taseen",2233051,3.80);
		System.out.println(s4.getName() + "   "+ s4.getId()+ " CGPA: "+s4.getCgpa());
		Student s5 =new Student("Syed  ",2311711,3.70);
		System.out.println(s5.getName() + "   "+ s5.getId()+ " CGPA: "+s5.getCgpa());
		Student s2 =new Student("Sajid ",2311712,3.60);
		System.out.println(s2.getName() + "   "+ s2.getId()+ " CGPA: "+s2.getCgpa());
		
		System.out.println();
		Student s6 =new Student();
		s6.setName("Samiul Hasnat Taseen");
		s6.setId(2233054);
		s6.setCgpa(3.85);
		System.out.println(s6.getName() + "   "+ s6.getId()+ " CGPA: "+s6.getCgpa());
		System.out.println();
		
		//Employee Object
		Employee E1=new Employee();
		E1.setName("Samiul Hasnat Taseen");
		E1.setId(1100704);
		E1.setDesignation("Junior Developer");
		System.out.println(E1.getName());
		System.out.println(E1.getId());
		System.out.println(E1.getDesignation());
		
		System.out.println();
		Employee E2=new Employee("Samiul Hasnat",17182496,"Jr. Engineer");
		System.out.println(E2.getName());
		System.out.println(E2.getId());
		System.out.println(E2.getDesignation());
		
		//area
		System.out.println();
		Shape Rec=new Shape("Rectangle",6.5f,7.99f,0);
		System.out.println(Rec.getName()+" Length: "+Rec.getLength()+" width: "+Rec.getWidth()+" Area: "+Rec.area());
		Shape Cir=new Shape("Circle",0,0,5);
		System.out.println(Cir.getName()+" Area: "+Cir.cirarea());
		
	}	
}