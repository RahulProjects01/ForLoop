
import java.util.Scanner;

public class File_12{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hight");
        int k = sc.nextInt();

        float c = k - 273.15f ;

        System.out.print(c);
    }
}
