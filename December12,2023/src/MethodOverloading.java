class Sum {
	double a;
	double b;
	double c;
	public Sum() {
		
	}
	double Sum(double a,double b) {
		this.a=a;
		this.b=b;
		return a+b;
	}
	double Sum(double a,double b,double c) {
		this.a=a;
		this.b=b;
		this.c=c;
		return a+b+c;
	}
}


public class MethodOverloading {

	public static void main(String[] args) {
		Sum sumOf2= new Sum();
		Sum sumOf3= new Sum();
		System.out.println("Sum of two: "+ sumOf2.Sum(3.5,4.7));
		System.out.println("Sum of three: "+ sumOf3.Sum(3.5,4.7,6.3));
	}

}
