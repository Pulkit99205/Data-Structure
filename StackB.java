import java .util.*;
class Stackpp
{
    int top=-1;
    int MaxSize;
    int a[];
    public Stackpp(int size)
    {
        this.MaxSize=size;
        this.a=new int [MaxSize];

    }

    void push(int data)
    {
        top++;
        a[top]=data;
    }
    int pop()
    {
        int oldvar=top;
        top--;
        return a[oldvar];
    }

    boolean IsEmpty()
    {
        return(top==-1);

    }
    boolean IsFull()
    {
        return(MaxSize-1==top);
    }
}

public class StackB
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of stack");
        int n=sc.nextInt();
        Stackpp sujan=new Stackpp(n);

        for(int i=0;i<n;i++)
        {
            int ram=sc.nextInt();
            sujan.push(ram);
        }
        System.out.println("elements in the list are");

        while(!sujan.IsEmpty())
        {
            long value=sujan.pop();
            System.out.println(value);
        }
    }
}
