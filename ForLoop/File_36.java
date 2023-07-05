
import java.util.Scanner;

public class File_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(
                "input a for check Armstrong number\n input for p to check prime number\n input l to check pallindrome: ");
        char user = sc.next().charAt(0);
        System.out.println(user);

        if (user == 'a') {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            System.out.print(num);
            int rem, sum = 0;
            int temp = num;

            for (; num > 0;) {
                rem = num % 10;
                sum = sum + rem * rem * rem;
                num = num / 10;

                if (temp == sum) {
                    System.out.println(" armstrong number");

                } else {
                    System.out.println("not armstrong number");
                }
            }
        } else if (user == 'p') {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            for (int i = 2; num > i; i++) {
                if (num % i == 0) {
                    System.out.println(" not prime");
                    break;
                } else if (num - 1 == i) {
                    System.out.print("prime number");
                }
            }
        } else if (user == 'l') {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            System.out.println(num);
            int rem, sum = 0;
            int temp = num;
            for (; num > 0;) {
                rem = num % 10;
                sum = sum * 10 + rem;
                num = num / 10;
            }
            if (temp == sum) {
                System.out.println("this is pallindrome number");
            } else {
                System.out.println("this is not pallindrome");
            }
        }
    }
}
