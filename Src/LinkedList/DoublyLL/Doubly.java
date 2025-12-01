package LinkedList.DoublyLL;



public class Doubly {

    DNode root;

    void insert_left(int data) {
        DNode n = new DNode(data);
        if (root == null)
            root  = n;
        else {
            n.next=root;
            root.prev=n;
            root=n;
        }
    }

    void insert_right(int data) {
        DNode n = new DNode(data);
        if (root == null) {
            root  = n;//first DNode

        } else {
            DNode t = root;
            while(t.next!=null)
            {
                t=t.next;

            }
            t.next=n;
            n.prev=t;
        }
    }

    void delete_right(){
        if (root == null)
            System.out.print("\nLinked list empty");
        else {
            DNode t,t2;
            t = root;
            while (t.next != null)//2
            {
                t = t.next;
            }
            t2=t.prev;
            t.prev=null;//3
            t2.next=null;//4
            System.out.print("\n" + t.data + " deleted");
        }
    }




    void delete_left() {


        {
            if (root == null)
                System.out.print("\nLinked list empty");
            else {
                DNode t = root;//1
                root = root.next;//2
                root.prev = null;//3
                System.out.print("\n" + t.data + " deleted");

            }
        }
    }

    void print_list() {

        if (root == null)
            System.out.print("\nLinked list empty");
        else {
            DNode t = root;//1
            while(t.next != null )
            {
                t=t.next; // last tak le ke jayega

            }
            do {
                System.out.print("<-"+t.data+"->");
                t=t.prev;
            }while(t!=null);
        }
    }
}
