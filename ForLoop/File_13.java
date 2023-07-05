
import java.util.Scanner;

public class File_13{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hight");
        int r = sc.nextInt();

        float pi = 3.14f;
        float v = 4/3*pi*r*r*r ;

        System.out.print(v);
    }
}
