package LinkedList.UsingStack;
import LinkedList.SinglyLL.Node;
import Stack_Examples.Stack_Class.*;


import java.util.Scanner;

public class llStack
{
    Node root;//only thing you would remeber
    void insert_left(int data)
    {
        Node n=new Node(data);
        if(root==null)
            root=n;//first node
        else
        {
            n.next=root;//1
            root=n;//2
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
    void print_list() {
        if (root == null)
            System.out.print("\nLinked list empty");
        else {
            Node t = root;//1
            while (t != null) {
                System.out.print("| " + t.data + "|->");
                t = t.next;//2
            }
        }

    }}