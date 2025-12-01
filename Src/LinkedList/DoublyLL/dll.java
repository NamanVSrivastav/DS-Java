package LinkedList.DoublyLL;
import java.util.Scanner;

public class dll {
    Dnodel root;//only thing you would remeber
    void insert_left(int data)
    {
        Dnodel n=new Dnodel(data);
        if(root==null)
            root=n;//first Dnodel
        else
        {
            n.right=root;//1
            root.left=n;//2
            root=n;//3
        }
    }
    void insert_right(int data)
    {
        Dnodel n=new Dnodel(data);
        if(root==null)
            root=n;//first Dnodel
        else
        {
            Dnodel t=root;//1
            while(t.right!=null)//2
                t=t.right;
            t.right=n;//3
            n.left=t;//4
        }
    }
    void delete_left()
    {
        if (root == null)
            System.out.print("\nLinked list empty");
        else
        {
            Dnodel t=root;//1
            root=root.right;//2
            root.left=null;//3
            System.out.print("\n"+t.data+" deleted");

        }
    }
    void delete_right() {
        if (root == null)
            System.out.print("\nLinked list empty");
        else {
            Dnodel t, t2;
            t = root;//1
            while (t.right != null)//searching for last 2
                t = t.right;

            if (t == root)//single Dnodel only
                root = null;//manual deletion
            else//more than one
            {
                t2 = t.left;//3
                t2.right = null;//4
                System.out.print("\n" + t.data + " deleted");
            }
        }
    }
    void print_list()
    {
        if (root == null)
            System.out.print("\nLinked list empty");
        else
        {
            Dnodel t=root;//1
            while(t!=null)
            {
                System.out.print("<-| "+t.data+"|->");
                t=t.right;//2
            }
        }
    }
    void rev_print_list()
    {
        if (root == null)
            System.out.print("\nLinked list empty");
        else
        {
            Dnodel t=root;//1
            while(t.right!=null)//right most
                t=t.right;//2
            while(t!=null)
            {
                System.out.print("<-| "+t.data+"|->");
                t=t.left;//2
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dll list = new dll();
        int choice, data;

        do {
            System.out.println("\n===== LINKED LIST MENU =====");
            System.out.println("1. Insert Left");
            System.out.println("2. Insert Right");
            System.out.println("3. Delete Left");
            System.out.println("4. Delete Right");
            System.out.println("5. Print List");
            System.out.println("6. Print Reverse List");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert left: ");
                    data = sc.nextInt();
                    list.insert_left(data);
                    break;

                case 2:
                    System.out.print("Enter data to insert right: ");
                    data = sc.nextInt();
                    list.insert_right(data);
                    break;

                case 3:
                    list.delete_left();
                    break;

                case 4:
                    list.delete_right();
                    break;

                case 5:
                    list.print_list();
                    break;
                case 6:
                    list.rev_print_list();
                    break;
                case 0:
                    System.out.println("Exiting… stay synced! 👋");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);

        sc.close();
    }

}
