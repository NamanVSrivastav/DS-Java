package LinkedList.SinglyLL;

public class LinkedListClass {
    Node root;//instance field ---

    void insert_left(int data){//method non static we need object of class  to call this method.
        Node n = new Node(data);
        if(root==null){
            root=n; //transferring of ownership
        }
        else{
              n.next=root;
              root=n;
        }
    }
    //-----------------------------------------------------
    void insert_right(int data){
        Node n = new Node(data);
        if(root==null){
            root=n;
        }
        else{
            Node t =root;// t used as  alias bcoz root will not move // local variable
            while(t.next!=null){
                t=t.next;
            }
            t.next=n;
        }

    }
     void delete_left()
    {
        if (root == null)
            System.out.print("\nLinked list empty");
        else
        {
            Node t=root;//1
            root=root.next;//2
            System.out.print("\n"+t.data+" deleted");

        }
    }
    void delete_right()
    { if (root == null)
        System.out.print("\nLinked list empty");
        // there is no delete command as GC does all work of deleting
    else
    {   Node t,t2;
        t=t2=root;//1
        while(t.next!=null)//searching for last 2
        {t2=t;t=t.next;
        }
        if(t==root)//single node only
            root=null;//manual deletion
        else//more than one
            t2.next=null;//break link//3
        System.out.print("\n"+t.data+" deleted");
    }
    }


    void print_list()
    {
        if (root == null)
            System.out.print("\nLinked list empty");
        else
        {
            Node t=root;//1
            while(t!=null)
            {
                System.out.print("| "+t.data+"|->");
                t=t.next;//2
            }
        }
    }
    boolean search_list(int key)
    {
        if (root == null)
            System.out.print("\nLinked list empty");
        else
        {
            Node t=root;//1
            while(t!=null)
            {
                if(key==t.data)
                    return true;
                t=t.next;//2
            }
        }
        return false;
    }
    void insert_after(int ref,int data) {
        if (root == null)
            System.out.print("\nLinked list empty");
        else {
            Node t = root;//1
            while (t != null) {
                if (ref == t.data)
                    break;//stop searching
                t = t.next;//2
            }
            if (t == null)
                System.out.print("\nElement not found");
            else//found
            {
                Node n = new Node(data);
                n.next = t.next;//1
                t.next = n;//2
                System.out.print("\ninserted");
            }

        }

    }
    void delete_element(int key)
    {
        if (root == null)
            System.out.print("\nLinked list empty");
        else {
            Node t = root;//1
            Node t2=root;//1
            while (t != null)
            {
                if (key == t.data)
                    break;//stop searching
                t2=t;//1
                t = t.next;//2
            }
            if (t == null)
                System.out.print("\nElement not found");
            else//found
            {
                System.out.print("\nFound\n");
                if(t==root)//case left most
                    root=root.next;//del left
                else if(t.next==null)//case 2 right most
                    t2.next=null;//delete right
                else//case 3
                    t2.next=t.next;//bypass
                System.out.print("\n"+t.data+" deleted");
            }

        }

    }



}
