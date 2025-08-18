import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        //print first n odd number
        Scanner sc= new Scanner(System.in);
        int i,n;
        System.out.print("ENTER THE NUMBER:");
        n = sc.nextInt();
        for (i=0;i<(n*2);i++)
        {
            if(i%2!=0)
                System.out.println(i);
        }

        //write natural number in reverse
        System.out.println("PRINTING NATURAL NUMBER IN REVERSE:");
        for (i=n;i>0;i--)
        {
            System.out.println(i);
        }

    }
}
