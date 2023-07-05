
import java.util.Scanner;

public class File_10{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hight");
        int fr = sc.nextInt();

       
        float aria =  ((fr-32)*5)/9;

        System.out.print(aria);
    }
}
