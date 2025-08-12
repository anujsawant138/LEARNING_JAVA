import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String s;
        int you=0,me=0;

        System.out.println("<<   \"LET`S PLAY THE ROCK,PAPER,SCISSOR GAME\"   >>");
        do {
            System.out.println("-----------------------------------------------------------");
            System.out.println("1.ROCK\n2.PAPER\n3.SCISSOR\n4.EXIT");
            System.out.println("-----------------------------------------------------------");
            System.out.print("ENTER YOUR CHOICE:");
            byte a = sc.nextByte();
            if(a>=4)
            {
                break;
            }
            int b = rand.nextInt(3) + 1;
            System.out.println("-----------------------------------------------------------");
            if (a == 1)
                System.out.println("\t\t\t\t\t\"YOU CHOOSE ROCK.\"");
            else if (a == 2)
                System.out.println("\t\t\t\t\t\"YOU CHOOSE PAPER.\"");
            else if (a == 3)
                System.out.println("\t\t\t\t\t\"YOU CHOOSE SCISSOR.\"");
            System.out.println("-----------------------------------------------------------");
            if (b == 1)
                System.out.println("\t\t\t\t\t\"I CHOOSE ROCK.\"");
            else if (b == 2)
                System.out.println("\t\t\t\t\t\"I CHOOSE PAPER.\"");
            else if (b == 3)
                System.out.println("\t\t\t\t\t\"I CHOOSE SCISSOR.\"");

            if ((a == 1 && b == 1) || (a == 2 && b == 2) || (a == 3 && b == 3)) {
                System.out.println("-----------------------------------------------------------");
                System.out.println("\t\t\t\t\t\'IT`S A DRAW.\'");
            } else if ((a == 1 && b == 2) || (a == 2 && b == 3) || (a == 3 && b == 1)) {
                System.out.println("-----------------------------------------------------------");
                System.out.println("\t\t\t\t\t\'OOPS!,YOU LOSE.\'");
                ++me;
            } else {
                System.out.println("-----------------------------------------------------------");
                System.out.println("\t\t\t\t\t\'CONGRATULATIONS,YOU WIN.\'");
                ++you;
            }
            sc.nextLine();
            System.out.println("-----------------------------------------------------------");
            System.out.println("\t\t\t\t\t<< CURRENT SCORE >>");
            System.out.println("\t\t\t\t\t\t\tYOU:"+you);
            System.out.println("\t\t\t\t\t\t\tME:"+me);
            System.out.println("-----------------------------------------------------------");
            System.out.print("DO YOU WISH TO CONTINUE (ENTER \'y\'):");
            s=sc.nextLine();
        }while(s.equalsIgnoreCase("y"));

    }
}
