package lec2;

public class Task3 {
	public static void main(String[] args) {
		//task3
		int min=100,max=150,x=min;
		while(x<=max && x>=min) {
			if(x%8==0) {
				System.out.println(x);
			}
			x++;
		}
	}
}
