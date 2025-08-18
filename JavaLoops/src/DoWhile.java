import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        //natural number using do-while
        int i=1,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER:");
        n = sc.nextInt();
        do{
            System.out.println(i);
            i++;
        }while (i<=n);


    }
}
