public class JavaArray {
    public static void main(String[] args) {
        //CREATING AN ARRAY
        int [] arr = new int[5];
        //we have created a array with size 5
        arr[0]=4;
        arr[1]=3;
        arr[2]=2;
        arr[3]=1;
        arr[4]=0;
        System.out.println("PRINTING THE SIZE OF AN ARRAY:"+arr.length);

        //displaying an array
        int i;
        System.out.println("ARRAY:");
        for (i=0;i<5;i++)
        {
            System.out.print(arr[i]+"->");
        }
        System.out.println("\b\b");

        //displaying an array in reverse
        System.out.println("REVERSE ARRAY");
        for (i=4;i>=0;i--)
        {
            System.out.print(arr[i]+"->");
        }
        System.out.println("\b\b");

        System.out.println("PRINTING ARRAY USING FOR_EACH_LOOP");
        for (int ele:arr)
        {
            System.out.print(ele+"->");
        }
        System.out.println("\b\b");


    }
}
