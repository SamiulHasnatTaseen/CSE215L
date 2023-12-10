package lec2;

public class Lec3 {

	public static void main(String[] args) {
		//task1
		
		int min =5, max=20;
		int n = (int)(min+Math.random()*(max-min+1));
		System.out.println("Random number "+n);
		for(int i = 0; i<=n;i++) {
			System.out.print(" "+i+"");
		}
		
		//task4
		
		int miny =1990, maxy=2020;
		int ry = (int)(miny+Math.random()*(maxy-miny+1));
		if(ry%400==0 || ry%4==0) {
		System.out.println(ry + " is leap year");
		}else {
			System.out.println(ry + " is not leap year");	
		}
		
		//task2
		for(int row = 5; row>=1;row--){
			for(int col = 1; col<=row;col++) {
			System.out.print(col);
			}
			System.out.println();
		}
	}

}
