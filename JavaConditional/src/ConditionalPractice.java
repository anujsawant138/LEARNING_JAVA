import java.util.Scanner;

public class ConditionalPractice {
    public static void main(String[] args) {
        /*1.WAP TO FIND OUT WHETHER A STUDENT IS PASS OR FAIL ,IF IT REQUIRES THAT 40% AND 33% IN EACH SUBJECT TO PASS ,
        ASSUME 3 SUBJECTS AND TAKE MARK AS INPUT*/
        Scanner sc = new Scanner(System.in);
        int m1,m2,m3;
        System.out.println("\"ENTER MARKS OUT OF HUNDRED \"");

        System.out.print("ENTER MARKS OF SUBJECT 1:");
        m1 = sc.nextInt();
        System.out.print("ENTER MARKS OF SUBJECT 2:");
        m2 = sc.nextInt();
        System.out.print("ENTER MARKS OF SUBJECT 3:");
        m3 = sc.nextInt();
        float total = (m1+m2+m3)/3.0f;

        if(total>=40 && m1>33 && m2>33 && m3>33)
        {
            System.out.println("CONGRATULATIONS!,YOU PASSED.");
            System.out.println("YOUR TOTAL SCORE IS "+total);
        }
        else {
            System.out.println("UNFORTUNATELY,YOU FAILED.");
        }

        /* 2. CALCULATE INCOME TAX PAID BY AN EMPLOYEE TO THE GOVERNMENT AS PER THE SLOTS MENTIONED BELOW*/
        System.out.print("ENTER YOUR INCOME(IN LAKH):");
        float Sal = sc.nextFloat();
        if(Sal<=2.5)
        {
            System.out.println("YOU DO NOT HAVE TO PAY TAX TO THE GOVERNMENT.");
        }
        else if(Sal<=5 && Sal>2.5)
        {
            System.out.println("YOU PAY 5% TAX TO GOVERNMENT.");
        }
        else if(Sal<=10 && Sal>5)
        {
            System.out.println("YOU PAY 20% TAX TO GOVERMENT.");
        }
        else{
                System.out.println("YOU PAY 30% TAX TO GOVERMENT.");
        }

        //3. WAP TO FIND OUT THE DAY OF THE WEEK GIVEN NUMBER (1 FOR MONDAY...)
        System.out.print("ENTER THE NUMBER OF DAY:");
        byte n = sc.nextByte();

        switch(n)
        {
            case 1 -> System.out.println("MONDAY");
            case 2 -> System.out.println("TUESDAY");
            case 3 -> System.out.println("WEDNESDAY");
            case 4 -> System.out.println("THURSDAY");
            case 5 -> System.out.println("FRIDAY");
            case 6 -> System.out.println("SATURDAY");
            case 7 -> System.out.println("SUNDAY");
            default -> System.out.println("ENTER VALID DAY");
        }
        //4.TO FIND THE LEAP YEAR
        System.out.print("ENTER THE YEAR:");
        int year = sc.nextInt();

        if((year%4==0 && year%100!=0) || year%400==0 )
        {
            System.out.println("THE GIVEN YEAR IS A LEAP YEAR");
        }
        else {
            System.out.println("THE GIVEN YEAR IS NOT A LEAP YEAR");
        }
        //5.WAP PROGRAM TO IDENTIFY THE TYPE OF WEBSITE
        sc.nextLine();
        String s;
        System.out.print("ENTER THE WEBSITE:");
        s=sc.nextLine();

        if(s.endsWith(".org"))
            System.out.println("THIS IS AN ORGANIZATION WEBSITE.");
        else if (s.endsWith(".com"))
            System.out.println("THIS IS A COMMERCIAL WEBSITE.");
        else if (s.endsWith(".in"))
            System.out.println("THIS IS AN INDIAN WEBSITE.");
        else
            System.out.println("THIS IS ANOTHER TYPE OF WEBSITE.");

    }

}
