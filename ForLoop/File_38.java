 //  write and make a program user give two character like e and o e denoted even number and o denoted odd number when user input e then input a range and calculate even and odd number in java ?(use if else if and for loop) 


// Program:- 

import java.util.Scanner;

public class File_38{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int start;
        int end;
        System.out.print("Press E for even And O for odd: ");
        char user = sc.next().charAt(0);
        System.out.println(user);

        if (user == 'e') {
            System.out.print("Enter your starting range: ");
            start = sc.nextInt();

            System.out.print("Enter your ending range: ");
            end = sc.nextInt();

            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    count++;
                }
            }
            System.out.println("total even numbers are: ");
            System.out.println(count);
        }

        else if (user == 'o') {
            System.out.print("Enter your starting range: ");
            start = sc.nextInt();
            System.out.println(start);

            System.out.print("Enter your ending range: ");
            end = sc.nextInt();
            System.out.println(end);

            for (int i = start; i <= end; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                    count++;
                }
            }
            System.out.println("total even numbers are: ");
            System.out.println(count);
        }
    }
}