public class BreakAndContinue {
    public static void main(String[] args) {
        //Break and Continue using LOOPS
        int i;
        for(i=0;i<5;i++)
        {
            if(i==2)
                break;
                System.out.println("USING BREAK WHEN i==2\n");
        }

        for(i=0;i<5;i++)
        {
            if(i==2)
                continue;
                System.out.println("USING continue WHEN i=="+i);
        }
    }
}
