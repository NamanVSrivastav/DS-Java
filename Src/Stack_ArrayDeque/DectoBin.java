package Stack_ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DectoBin {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter number");
        int n = in.nextInt();
        int num = 0;

        while (n!=0){
            num=n%2;
            stack.push(num);
            n=n/2;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }

    }
}
