public class Practice {
    public static void main(String[] args) {
        //create an array of 5 floats and displaying their sum
        float[] arr = {4.1f, 5.2f, 6.3f, 7.4f, 8.5f};
        float sum = 0;
        int i,j;
        for (i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("SUM:"+sum);

        //to find if given integer is in array or not
        float g =5.2f;
        for (i=0;i<arr.length;i++)
        {
            if(g==arr[i]) {
                System.out.println("yes it is present");
            }
        }
        //average marks
        float [] marks= {67,56.5f,87,89.5f,97};
        for (float ele:marks)
        {
            sum+=ele;
        }
        System.out.println("AVERAGE:"+sum/marks.length);

        //wap to add two matrix of size 2x3

        int [][] arr1 = {{1,2,3},{4,5,6}};
        int [][] arr2 = {{6,5,4},{3,2,1}};
        int [][] arr3 = new int[2][3];
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(arr3[i][j]+"->");
            }
            System.out.println("\b\b");
        }

        //reverse an array
        int [] ar = {1,2,3,4,5};
        for (i=0;i<ar.length/2;i++)
        {
            j=ar[i];
            ar[i]=ar[ar.length-1-i];
            ar[ar.length-1-i]=j;
        }

        for(j=0;j<ar.length;j++)
        {
            System.out.print(ar[j]+"->");
        }
        System.out.println("\b\b");
        //finding the maximum number in array
        int max=ar[0];
        for(i=0;i<ar.length;i++)
        {
            if(ar[i]>max)
                max=ar[i];
        }
        System.out.println("MAXIMUM :"+max);
        //finding the minimum number in array
        int min=ar[0];
        for(i=0;i<ar.length;i++)
        {
            if(ar[i]<min)
                min=ar[i];
        }
        System.out.println("MINIMUM :"+min);

        //checking if sorted
        boolean a=true;
        for(i=0;i<ar.length-1;i++)
        {
            if(ar[i]>ar[i+1])
            {
                a=false;
                break;
            }
        }
        if (a)
            System.out.println("SORTED");
        else
            System.out.println("UNSORTED");

    }
}
