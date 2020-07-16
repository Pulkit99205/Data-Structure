import java.util.Arrays;
import java.util.Scanner;



public class BInarySearch  {
    public static void main(String args[])
    {
        int flag=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
//        System.out.printf("Modified arr[] : %s",
//                Arrays.toString(a));

        int low=0;
        int high=n-1;
        while (high >= low)
        {
            int mid = (low + high) / 2;

            if(a[mid]<v)
            {
                low=mid+1;
            }
            else if(a[mid]>v)
            {
                high=mid-1;
            }
            else if(a[mid]==v)
            {
                flag=1;
                System.out.println( v+"is found at postion"+ (mid));
                break;
            }
        }
        if(flag==0)
            System.out.println( v+"is  not found at postion ");
    }

}
