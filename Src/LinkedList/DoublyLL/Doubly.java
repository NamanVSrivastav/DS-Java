package LinkedList.DoublyLL;



public class Doubly {

    DNode root;
    DNode last;

    void insert_left(int data) {
        DNode n = new DNode(data);
        if (root == null) {
            root = last = n;//first DNode

        } else {
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

    void delete_left() {
        if (root == null)
            System.out.print("\nLinked list empty");
        else {
            DNode t = root;//1
            if (root == last)
                root = last = null;//manual deletion
            else {
                root = root.next;//2
                last.next = root;//3
            }
            System.out.print("\n" + t.data + " deleted");

        }
    }

    void delete_right() {
        if (root == null)
            System.out.print("\nLinked list empty");
        else {
            DNode t, t2;
            t = t2 = root;//1
            if (root == last)//single DNode
                root = last = null;
            else {
                while (t != last)//2
                {
                    t2 = t;
                    t = t.next;
                }
                last = t2;//3
                last.next = root;//4
                System.out.print("\n" + t.data + " deleted");
            }
        }
    }

    void print_list() {
        if (root == null)
            System.out.print("\nLinked list empty");
        else {
            DNode t = root;//1
            do {
                System.out.print("| " + t.data + "|->");
                t = t.next;//2
            } while (t != root);
        }
    }
}
