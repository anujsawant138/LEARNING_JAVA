import java.util.Scanner;

public class greet {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER YOUR NAME:");
        String str= sc.nextLine();
        System.out.println("Hello "+str+", have a Good Day");

    }
}
