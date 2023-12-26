import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//initialize the array
		int[] arr = new int[6];
		
		//take input
		for(int i=0;i<6;i++) {
			System.out.println("Enter the "+i+" elements of the array: ");
			arr[i]=sc.nextInt();
		}
		System.out.println(arr[2]);
		
		//sum
		int sum=0;
		for(int i=0;i<6;i++) {
			sum+=arr[i];
		}
		System.out.println("Sum: "+sum);
		
		//product
		int product=1;
		for(int i=0;i<6;i++) {
			product*=arr[i];
		}
		
		System.out.println("Product: "+product);
		
		sc.close();
		
	}

}
