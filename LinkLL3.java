import java.util.Scanner;
public class LinkLL3

{

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

    void insert(int data )
    {
        Node pulkit = new Node(data);
        if(head==null)
        {
            head=pulkit;

        }
        else
        {
            Node temp = head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=pulkit;
        }


    }


   void show()
   {
       Node temp = head;
       while(temp.next!=null)
       {
           System.out.print(temp.data + " ");
           temp=temp.next;
       }
       System.out.print(temp.data+"          ");
   }

    boolean check(int pp)
    {

        Node temp=head;
        while(temp.next!=null)
        {

            if(temp.data==pp)

                return true;
            temp=temp.next;

        }
        return false;
    }


    public static void main(String args[])
    {

        LinkLL3 linkll=new LinkLL3();
        linkll.insert(110);
        linkll.insert(115);
        linkll.insert(120);
        linkll.insert(125);
   linkll.show();
        Scanner sc=new Scanner(System.in);


        int pp=sc.nextInt();  //data after which value is stored
        //  int dd=sc.nextInt();   //data value to be stored in new node
        boolean hp=linkll.check(pp);
        System.out.println(hp);

    }
}
