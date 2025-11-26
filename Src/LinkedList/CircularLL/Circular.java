package LinkedList.CircularLL;

public class Circular {

    Node root;
    Node last;

    void insert_left(int data) {
        Node n = new Node(data);
        if (root == null) {
            root = last = n;//first node
            last.next = root;
        } else {
            n.next = root;//1
            root = n;//2
            last.next = root;//3
        }
    }

    void insert_right(int data) {
        Node n = new Node(data);
        if (root == null) {
            root = last = n;//first node
            last.next = root;
        } else {
            last.next = n;//1
            last = n;//2
            last.next = root;//3
        }
    }

    void delete_left() {
        if (root == null)
            System.out.print("\nLinked list empty");
        else {
            Node t = root;//1
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
            Node t, t2;
            t = t2 = root;//1
            if (root == last)//single node
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
            Node t = root;//1
            do {
                System.out.print("| " + t.data + "|->");
                t = t.next;//2
            } while (t != root);
        }
    }
}