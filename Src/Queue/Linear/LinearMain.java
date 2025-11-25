package Queue.Linear;
import java.util.Scanner;

public class LinearMain {

    public static void main(String[] args) {
        LinearQueueClass obj=new LinearQueueClass();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of queue:");
        int size=in.nextInt();
        obj.create_queue(size);
        int choice=0;
        do
        {
            System.out.print("\nqueue Menu");
            System.out.print("\n----------");
            System.out.print("\n1.enqueue");
            System.out.print("\n2.dequeue");
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
                        System.out.print("\n"+element+" enqueueed");
                    }
                    else
                        System.out.print("\nqueue Full");
                    break;
                case 2:
                    if(obj.isempty()!=true)//not empty
                    {
                        System.out.print("\nElement dequeueed:"+obj.dequeue());
                    }
                    else
                        System.out.print("\nqueue Empty");
                    break;

                case 3:
                    if(obj.isempty()!=true)//!obj.isfull()
                    {
                        System.out.print("\nElements in queue are:\n");
                        obj.print_queue();
                    }
                    else
                        System.out.print("\nqueue Empty");
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
