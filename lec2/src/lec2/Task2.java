package lec2;

public class Task2 {
	public static void main(String[] args) {
		//task5
		for(int row = 0; row<5;row++){
			for(int col = 1; col<=(2*row)+1;col++) {
				if(row%2==0) {
				System.out.print("*");
				}else {
				System.out.print("+");	
				}
			}
			System.out.println();
	}
}
}