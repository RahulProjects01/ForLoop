
import java.util.Scanner;

public class File_11{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hight");
        int cm = sc.nextInt();

        float aria = cm * 0.01f;

        System.out.print(aria);
    }
}