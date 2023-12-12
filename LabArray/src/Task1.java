import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array=new int[6];
		
		for (int i =0; i<6; i++) {
			System.out.println("Enter number"+(i+1)+" : ");
			array[i]=scan.nextInt();
		}
		
		double sum=0;
		for (int i =0; i<6; i++) {
			sum+=array[i];
		}
		double avg = sum/6;
		System.out.println("Average: " + avg);
		
		double countAboveAvg = 0;
	        for (int i =0; i<6; i++) {
	            if (array[i] > avg) {
	            	countAboveAvg++;
	            }
	        }
	    double perAboveAvg = countAboveAvg * 100 / 6 ;
	    System.out.println("Percentage of numbers above average: " + perAboveAvg + "%");
		scan.close();
	}
}
