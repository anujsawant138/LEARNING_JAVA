public class Practice {
    public static void main(String[] args) {
        //1.printing the pattern
        int i,j;
        for (i=4;i>0;i--)
        {
            for(j=0;j<i;j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

        //2.sum of n even number

        int sum=0,n=4;
        for (i=0;i<n*2;i++)
        {
            if(i%2==0)
                sum+=i;
        }
        System.out.println(sum);

        //multiplication table
        n=5; //table of 5
        System.out.println("PRINTING THE TABLE OF "+n);
        for (i=1;i<=10;i++)
        {
            System.out.println(n*i);
        }
        //printing the table of 10 in reverse order
        System.out.println("printing the table of 10 in reverse order");
        for(i=10;i>0;i--)
        {
            System.out.println(10*i);
        }

        //FACTORIAL
        n=5;
        int fact=1;
        for(i=1;i<=n;i++)
            fact*=i;
        System.out.println("FACTORIAL OF "+n+" :"+fact);
        //FACTORIAL USING WHILE
        n=5;
        fact=1;
        while(n>0)
        {
            fact*=n;
            n--;
        }
        System.out.println("FACTORIAL USING WHILE LOOP:"+fact);

        //sum of number occuring in table of 8
        sum=0;
        for (i=1;i<=10;i++)
        {
            System.out.println(8*i);
            sum+=(8*i);
        }
        System.out.println("SUM OF TABLE: "+sum);

    }
}
