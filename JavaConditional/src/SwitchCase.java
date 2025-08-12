import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR GRADE(A-D):");
        String c = sc.next();
        

        switch (c) {
            case "A": {
                System.out.println("You have Scored Marks in the Range of 90-100");
                break;
            }
            case "B": {
                System.out.println("You have Scored Marks in the Range of 80-90");
                break;
            }
            case "C": {
                System.out.println("You have Scored Marks in the Range of 65-80");
                break;
            }
            case "D": {
                System.out.println("You have Scored Marks in the Range of 50-65");
                break;
            }
            default:
                System.out.println("BETTER LUCK NEXT TIME!");

        }
    }
}
