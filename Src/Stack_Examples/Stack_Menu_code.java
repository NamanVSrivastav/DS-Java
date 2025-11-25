package Stack_Examples;

import java.util.Scanner;

public class Stack_Menu_code
{
    public static void main(String[] args) {
        Stack_Class obj=new Stack_Class();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of stack:");
        int size=in.nextInt();
        obj.create_stack(size);
        int choice=0;
        do
        {
            System.out.print("\nStack Menu");
            System.out.print("\n----------");
            System.out.print("\n1.Push");
            System.out.print("\n2.Pop");
            System.out.print("\n3.Peek");
            System.out.print("\n4.Print");
            System.out.print("\n0.Exit");
            System.out.print("\n:");
            choice=in.nextInt();
            switch (choice)
            {
                case 1:
                    if(obj.isfull()!=true)//!obj.isfull()
                    {
                        System.out.print("\nEnter element:");
                        int element=in.nextInt();
                        obj.push(element);
                        System.out.print("\n"+element+" pushed");
                    }
                    else
                        System.out.print("\nStack Full");
                    break;
                case 2:
                    if(obj.isempty()!=true)//not empty
                    {
                        System.out.print("\nElement poped:"+obj.pop());
                    }
                    else
                        System.out.print("\nStack Empty");
                    break;
                case 3:
                    if(obj.isempty()!=true)//not empty
                    {
                        System.out.print("\nElement at Peek is:"+obj.peek());
                    }
                    else
                        System.out.print("\nStack Empty");
                    break;
                case 4:
                    if(obj.isempty()!=true)//!obj.isfull()
                    {
                        System.out.print("\nElements in stack are:\n");
                        obj.print_stack();
                    }
                    else
                        System.out.print("\nStack Empty");
                    break;
                case 0:
                    System.out.print("\nThanks for using the code @Nova.Sri");
                    break;
                default:
                    System.out.print("\nInvalid input. ");
                    break;
            }
        }while(choice!=0);
    }
}

