import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		//Scanner object
		Scanner scan=new Scanner(System.in);
		
		//professor object
		Professor prof = new Professor();
		System.out.println("Enter Professor name: ");
		prof.setName(scan.nextLine());
		System.out.println("Enter Professor phone number: ");
		prof.setPhoneNumber(scan.nextInt());
		System.out.println("Enter Professor salary: ");
		prof.setSalary(scan.nextDouble());
				
		System.out.println(prof.toString());
				
		System.out.println(prof.PurchaseParkingPass());
				
		
		//student object
		Student stu = new Student();
		scan.hasNextLine();
		System.out.println("Enter student name: ");
		stu.setName(scan.nextLine());
		System.out.println("Enter student phone number: ");
		stu.setPhoneNumber(scan.nextInt());
		System.out.println("Enter student student number: ");
		stu.setStudentNumber(scan.nextInt());
		
		System.out.println("Enter student Department: ");
		stu.setDepartment(scan.nextLine());
		System.out.println();
		System.out.println("Enter student age: ");
		stu.setAge(scan.nextInt());
		System.out.println();
		
		System.out.println(stu.toString());
		
		System.out.println(stu.PurchaseParkingPass());
		
		
		//Scanner close
		scan.close();
	}

}
