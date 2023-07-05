// write and make a program user input any number and user input like f then calculate a factorial of code and user input a character like r then calculate a reverse number only. 

 import java.util.Scanner;

public class File_37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input f for check factorial of number\n input r to check revarce number: ");
        char user = sc.next().charAt(0);
        System.out.println(user);

        if (user == 'r') {
            System.out.print("Enter a value");
            int num = sc.nextInt();
            System.out.println(num);
            int rem, sum = 0;
            for (; num > 0;) {
                rem = num % 10;
                sum = sum * 10 + rem;
                num = num / 10;
            }
            System.out.println(sum);
        } else if (user == 'f') {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of " + num + " is: " + fact);
        }
    }
}

