
import java.util.Scanner;

public class File_32{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter frist number: ");
        int num = sc.nextInt();
        System.out.println(num);

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println(num2);
       
        for (int i = 1; i <= 100; i++) {
            if(i%num==0 && i%num2==0){
                System.out.println(i);
            }
        }
    }
}
