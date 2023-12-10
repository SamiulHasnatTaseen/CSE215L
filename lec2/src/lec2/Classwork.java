package lec2;
import java.util.Scanner;
public class Classwork {

	public static void main(String[] args) {
		// Taking input from user
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("Enter a line: ");
		String line1 =sc.nextLine();
		System.out.print("Enter X: ");
		int x =sc.nextInt();
		System.out.print("Enter Y: ");
		int y =sc.nextInt();
		System.out.print("Enter a double: ");
		double a =sc.nextDouble();
		System.out.print("Enter a float: ");
		float c =sc.nextFloat();
		System.out.print("Enter a char: ");
		char b =sc.next().charAt(0);
		sc.close();
		boolean z= true;
		System.out.println("Lets check boolean with comparison among X and Y " + (x>y) + " and Z is returning " + z);
		System.out.println(line1);
		System.out.println("Double " + a + " Charecter " + b + " Float "+ c);
		if (x%2==0) 
		{
		System.out.println("X is even");
		}
		else 
		{
		System.out.println("X is odd");
		}
		//Implementation using switch case operator
		switch(y%2) {
		case 0: 
			System.out.println("Y is even");
			break;
		default:
			System.out.println("Y is odd");
		}
		*/
		//Table
		/*int j =1;
		int x;
		while( j<=5) {
			System.out.print("Enter: ");
			x =sc.nextInt();
			for(int i = 1;i <= 10; i++) {
				System.out.println(x+" * "+i+" = "+(x*i));
			}
			System.out.println();
			j++;
		}
		*/
		//prime
		System.out.println("Enter p to check prime or not: ");
		int p=sc.nextInt();
		int n;
		if(p==2) {
			System.out.println("Prime");
			//break;
		}
		for (n=2;n<p;) {
			
			if (p%n==0) {
				System.out.println("Not Prime");
				break;
			}else {
				System.out.println("Prime");
				break;
			}
		}
		//divisor
		System.out.println("Enter K to find divisor: ");
		int y=sc.nextInt();
		int k=1;
		while(k<y) {
			if(y%k==0) {
				System.out.println(k);
			}
			k++;
		}
		sc.close();
	}
}