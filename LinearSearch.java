import java.util.Scanner;
public class LinearSearch {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v=sc.nextInt();
        int flag=0;
        int a[]=new int[n];
        for (int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            if(a[i]==v) {
                flag=1;
                System.out.println("v " + v + "is found at postion" + i);
                break;
            }

        }
        if (flag==0)
            System.out.println("Not Found");



    }

}
