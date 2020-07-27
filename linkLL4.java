//insert at any position
import java.util.Scanner;
public class linkLL4

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
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;

            // System.out.print(temp.data+"          ");
        }
    }

    void push(int pp, int dd)
    {

        Node temp=head;
        //  Node vaibhav;

        while(temp!=null)
        {
            Node kk;
            if(temp.data==pp)
            {
                Node madhopur=new Node(dd);
                kk=temp.next;
                madhopur.next=kk;
                temp.next=madhopur;
                break;
            }
            temp=temp.next;

        }
    }


    public static void main(String args[])
    {

        linkLL4 linkll=new linkLL4();
        linkll.insert(110);
        linkll.insert(115);
        linkll.insert(120);
        linkll.insert(125);

        Scanner sc=new Scanner(System.in);

        linkll.show();
        int pp=sc.nextInt();  //data after which value is stored
        int dd=sc.nextInt();   //data value to be stored in new node
        linkll.push(pp,dd);
        linkll.show();

    }
}

