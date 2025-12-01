package LinkedList.LLQuestions;
import java.util.LinkedList;
import java.util.Scanner;


public class Polynomial {
    public static void main(String[] args) {
        LinkedList<PNode> list1 = new LinkedList<>();
        LinkedList<PNode> list2 = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter highest power:");
        int power = in.nextInt();
        for (int i = power; i >= 0; i--)//power
        {
            System.out.println("Enter coefficient for X^" + i + ":");
            float co = in.nextFloat();
            list1.add(new PNode(co, i));
        }
        //Accepted polynomial.
        for (PNode item : list1) {
            item.print();
        }
        System.out.println("Enter highest power:");
        int power2 = in.nextInt();
        for (int i = power2; i >= 0; i--)//power
        {
            System.out.println("Enter coefficient for X^" + i + ":");
            float co2 = in.nextFloat();
            list2.add(new PNode(co2, i));
        }
        //Accepted polynomial.
        for (PNode item : list2) {
            item.print();
        }


    }
}
