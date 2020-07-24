// insertion in the begning 
public class LinkLL2
{
    class Node
    {
        int data ;
        Node next;


        public Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    Node head;
    void insert(int data)
    {
        Node pulkit=new Node(data);

        if(head==null)
            head=pulkit;

        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=pulkit;



        }
    }
    void show()
    {
        Node temp=head;
        while(temp.next!=null)
        {
            System.out.print(temp.data+ " ");
            temp=temp.next;

        }
        System.out.println(temp.data);

    }
    void push(int var)
    {

        Node nn=new Node(var);
        nn.next=head;
        head=nn;
    }

    public static void main(String args[])
    {
        LinkLL2 linkll=new LinkLL2();

        linkll.insert(105);
        linkll.insert(110);
        linkll.insert(115);

        linkll.push(45);
        linkll.show();
    }
}
