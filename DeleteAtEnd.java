import java.util.Scanner;
public class DeleteAtEnd {

    class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    Node head;
    // Node kk;

    void insert(int data )
    {
        Node pulkit=new Node(data);
        Node temp=head;
        if(head==null)
            head=pulkit;
        else
        {

            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=pulkit;

        }    }
    void show()
    {
        System.out.println("the ll elements are ");
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void delete()
    {
        Node temp= head;
        if (temp==null||temp.next==null)
        {
            System.out.println("The Linked List is empty");
            System.exit(0);
            //  return 0;

        }else
        {
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;

            //  return 0;
        }


    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        DeleteAtEnd ll=new DeleteAtEnd();
        System.out.println("Enter the no. of Nodes");
        int n= sc.nextInt();
        System.out.println("enter the values of Nodes");
        for (int i=1;i<=n;i++)
        {
            int val =sc.nextInt();
            ll.insert(val);
        }

        ll.show();
        ll.delete();
        if(ll.head.next!=null)
            ll.show();
    }
}

