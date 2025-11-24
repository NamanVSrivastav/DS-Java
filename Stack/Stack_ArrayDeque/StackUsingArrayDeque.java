package Stack_ArrayDeque;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class StackUsingArrayDeque {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        Scanner in = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.print("\nStack Menu");
            System.out.print("\n----------");
            System.out.print("\n1.Push");
            System.out.print("\n2.Pop");
            System.out.print("\n3.Peek");
            System.out.print("\n4.Print");
            System.out.print("\n0.Exit");
            System.out.print("\n:");
            choice = in.nextInt();
            switch (choice) {
                case 1:

                    System.out.print("\nEnter element:");
                    int element = in.nextInt();
                    stack.push(element);
                    System.out.print("\n" + element + " pushed");
                    break;
                case 2:
                    if (stack.isEmpty() != true)//not empty
                    {
                        System.out.print("\nElement poped:" + stack.pop());
                    } else
                        System.out.print("\nStack Empty");
                    break;
                case 3:
                    if (stack.isEmpty() != true)//not empty
                    {
                        System.out.print("\nElement at Peek is:" + stack.peek());
                    } else
                        System.out.print("\nStack Empty");
                    break;
                case 4:
                    if (stack.isEmpty() != true)//!obj.isfull()
                    {
                        System.out.print("\nElements in stack are:\n");
                        System.out.println(stack);
                    } else
                        System.out.print("\nStack Empty");
                    break;
                case 0:
                    System.out.print("\nThanks for using the code @amar.career");
                    break;
                default:
                    System.out.print("\nInvalid input. ");
                    break;
            }
        } while (choice != 0);
    }
}
