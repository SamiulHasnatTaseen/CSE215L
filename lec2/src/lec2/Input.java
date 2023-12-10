package lec2;
import java.util.Scanner;
public class Input {
	public static void main(String[] args) {
	Scanner obj =  new Scanner(System.in);
	System.out.println("Enter a double: ");
	double a = obj.nextDouble();
	char b = obj.next().charAt(0);
	System.out.println(a);
	System.out.println(b);
	obj.close();
	}
}
