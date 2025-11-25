import java.util.Scanner;

public class CircularMain {
    public static void main(String[] args) {
        CircularQueueClass obj=new CircularQueueClass();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of queue:");
        int size=in.nextInt();
        obj.create_queue(size);
        int choice=0;
        do
        {
            System.out.print("\nQueue Menu");
            System.out.print("\n----------");
            System.out.print("\n1.Enqueue");
            System.out.print("\n2.Dequeue");
            System.out.print("\n3.Print");
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
                        obj.enqueue(element);
                        System.out.print("\n"+element+" enqueued");
                    }
                    else
                        System.out.print("\nQueue Full");
                    break;
                case 2:
                    if(obj.isempty()!=true)//not empty
                    {
                        System.out.print("\nElement dequeued:"+obj.dequeue());
                    }
                    else
                        System.out.print("\nQueue Empty");
                    break;
                case 3:
                    if(obj.isempty()!=true)//!obj.isfull()
                    {
                        obj.print_queue();
                    }
                    else
                        System.out.print("\nqueue Empty");
                    break;
                case 0:
                    System.out.print("\nThanks for using the code @amar.career");
                    break;
                default:
                    System.out.print("\nInvalid input. ");
                    break;
            }
        }while(choice!=0);
    }

}
