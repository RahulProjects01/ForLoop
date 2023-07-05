
import java.util.Scanner;

public class File_19{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st value ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd value ");
        int num2 = sc.nextInt();

        System.out.print("Enter 3rd value ");
        int num3 = sc.nextInt();

        System.out.print("Enter 4th value ");
        int num4 = sc.nextInt();

        System.out.print("Enter 5th value ");
        int num5 = sc.nextInt();

        System.out.print("Enter 6th value ");
        int num6 = sc.nextInt();

         System.out.print("Enter 7th value ");
        int num7 = sc.nextInt();

          int sum = num1+num2*(num3+(num5*num6)/num5)+num7;

        System.out.print(sum);
    }
}
