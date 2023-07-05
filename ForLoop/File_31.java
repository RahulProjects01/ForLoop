
import java.util.Scanner;

public class File_31{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start range: ");
        int num = sc.nextInt();
        System.out.println(num);

        System.out.print("Enter ending range: ");
        int num2 = sc.nextInt();
        System.out.println(num2);

        for (int i = num; i <= num2; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i * j);
            }
            System.out.println(" ");
        }
    }
}

