
import java.util.Scanner;

public class File_23{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    System.out.println(num);
         int fact = 1;
        for (int i = 1; i <= num; i++) 
        { 
            fact = fact * i;
            System.out.println(i+"  factrioal is: "+fact);
        }
    }
}
