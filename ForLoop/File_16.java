
import java.util.Scanner;

public class File_16{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st value ");
        float num1 = sc.nextFloat();

        System.out.print("Enter 2nd value ");
        float num2 = sc.nextFloat();

        System.out.print("Enter 3rd value ");
        float num3 = sc.nextFloat();

        float sum = num1 + num1 * (num2 + num3);

        System.out.print(sum);
    }
}
