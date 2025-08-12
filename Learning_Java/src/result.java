import java.util.Scanner;

public class result {
    public static void main(Strings[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER THE MARKS OF SUBJECT 1:");
        int a1=sc.nextByte();
        System.out.print("ENTER THE MARKS OF SUBJECT 2:");
        int a2=sc.nextByte();
        System.out.print("ENTER THE MARKS OF SUBJECT 3:");
        int a3=sc.nextByte();
        System.out.print("ENTER THE MARKS OF SUBJECT 4:");
        int a4=sc.nextByte();
        System.out.print("ENTER THE MARKS OF SUBJECT 5:");
        int a5=sc.nextByte();
        System.out.print("ENTER THE MARKS OF SUBJECT 6:");
        int a6=sc.nextByte();
        float result=(a1+a2+a3+a4+a5+a6)/6;
        System.out.println("RESULT IS:"+result);

    }
}
