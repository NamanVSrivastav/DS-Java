package Queue.Questions;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DecToBIn {
    public static void main(String[] args) {
        System.out.println("enter a binary digit");
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        Deque<Integer> stack = new ArrayDeque<>();
        for(char c:n.toCharArray()){
            stack.offerLast(c-'0');

        }
        int size = stack.size();
        int sum=0;
        while(!stack.isEmpty()){
            int num = stack.pollFirst();
            sum+=(int)(Math.pow(2,size--));
        }


    }
}
