import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR AGE:");
        int age = sc.nextInt();
        if(age>=18)
            System.out.println("YES,YOU CAN DRIVE.");
        else
            System.out.println("NO,YOU CANNOT DRIVE.");
    }
}
