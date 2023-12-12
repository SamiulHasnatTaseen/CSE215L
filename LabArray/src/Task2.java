import java.util.Scanner;
public class Task2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scan.nextInt();
        int[] fiboArr = new int[num];
        if (num > 0) {
            fiboArr[0] = 0;
        }
        if (num > 1) {
            fiboArr[1] = 1;
        }
        for (int i = 2; i < num; i++) {
            fiboArr[i] = fiboArr[i - 1] + fiboArr[i - 2];
        }
       
        for (int i = 0; i < num; i++) {
            System.out.print(fiboArr[i] + " ");
        }
        scan.close();
    }
}
