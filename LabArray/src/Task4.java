import java.util.Scanner;
public class Task4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int num = scan.nextInt();
        int[] array = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            array[i] = scan.nextInt();
        }

        System.out.println("Numbers in consecutive orders of 3:");
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] == array[i + 1] && array[i + 1] == array[i + 2]) {
                System.out.print(array[i] + " ");
            }
        }
        scan.close();
    }
    }

