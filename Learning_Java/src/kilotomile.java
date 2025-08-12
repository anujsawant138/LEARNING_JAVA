import java.util.Scanner;
public class kilotomile {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Kilometer:");
        float kilo = sc.nextFloat();
        float mile= (float) (kilo/1.6);
        System.out.println("Kilometer to Mile is :"+mile);
        System.out.println("Enter a Integer Value:");
        boolean a=sc.hasNextInt();
        System.out.println(a);
     }

}
