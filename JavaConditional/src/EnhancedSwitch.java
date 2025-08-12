import java.util.Scanner;

public class EnhancedSwitch {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("ENTER YOUR GRADE(A-D):");
            String c = sc.next();


            switch (c) {
                case "A" -> {
                    System.out.println("You have Scored Marks in the Range of 90-100");
                }
                case "B" -> {
                    System.out.println("You have Scored Marks in the Range of 80-90");
                }
                case "C" -> {
                    System.out.println("You have Scored Marks in the Range of 65-80");
                }
                case "D" -> {
                    System.out.println("You have Scored Marks in the Range of 50-65");
                }

                default -> System.out.println("BETTER LUCK NEXT TIME!");
            }
        }
    }


