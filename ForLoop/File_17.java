
import java.util.Scanner;

public class File_17{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st value ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd value ");
        int num2 = sc.nextInt();

        System.out.print("Enter 3rd value ");
        int num3 = sc.nextInt();

        int sum = (num1 * num2) / num3;

        System.out.print(sum);
    }
}
