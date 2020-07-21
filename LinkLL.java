public class LinkLL
{
    class Node {
        int data;
        Node next;

        public Node(int data) {
          this.data=data;
          next=null;
        }
    }
    Node head;
    public void insert(int value)
    {
        Node pulkit=new Node(value);
        if(head==null)
        {
            head=pulkit;
        }
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
    public void show()
    {
        Node sir= head;
        while(sir.next!=null)
        {
            System.out.println(sir.data+" ");
            sir=sir.next;
        }
        System.out.println(sir.data);
    }
public static void main(String args[])
    {
        LinkLL list=new LinkLL();
         list.insert(15);
         list.insert(20);
         list.insert(25);
         list.insert(30);
         list.show();
    }
}
