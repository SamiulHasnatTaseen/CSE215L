import java.util.Scanner;

class Complex {
    private double r;
    private double i;

    public Complex() {

    }

    public Complex(double real, double imaginary) {
        this.r = real;
        this.i = imaginary;
    }

    public Complex add(double real, double imaginary) {
        double nR = this.r + real;
        double nI = this.i + imaginary;
        return new Complex(nR, nI);
    }

    public Complex multiply(double real, double imaginary) {
        // Formula: (a + ib) (c + id) = ac + iad + ibc + i2bd = (ac - bd) + i(ad + bc)
    	
        double nR = this.r * real - this.i * imaginary;
        double nI = this.r * imaginary + this.i * real;
        return new Complex(nR, nI);
    }
    
    //setter
    public void setReal(double real) {
        this.r = real;
    }

    public void setImaginary(double imaginary) {
        this.i = imaginary;
    }
    
    //getter
    public double getReal() {
        return r;
    }

    public double getImaginary() {
        return i;
    }
}

public class Show {
    public static void main(String[] args) {
        // Scanner Object
        Scanner scan = new Scanner(System.in);

        // First Number
        System.out.println("Real part of the first number:");
        double r1 = scan.nextDouble();
        System.out.println("Imaginary part of the first number:");
        double i1 = scan.nextDouble();

        // Second Number
        System.out.println("Real part of the second number:");
        double r2 = scan.nextDouble();
        System.out.println("Imaginary part of the second number:");
        double i2 = scan.nextDouble();

        Complex CN1 = new Complex(r1, i1);
        Complex CN2 = new Complex(r2, i2);

        // Calculation
        System.out.println();
        Complex CN3 = CN1.add(r2, i2);
        System.out.println("Sum: ");
        System.out.println(CN3.getReal() + "+" + CN3.getImaginary() + "i");

        System.out.println();
        Complex CN4 = CN1.multiply(r2, i2);
        System.out.println("Multiply: ");
        System.out.println(CN4.getReal() + "+" + CN4.getImaginary() + "i");

        // Scanner closing
        scan.close();
    }
}