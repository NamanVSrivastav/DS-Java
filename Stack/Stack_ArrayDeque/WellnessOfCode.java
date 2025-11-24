package Stack_ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class WellnessOfCode {
    public static void main(String[] args) {
    Deque<Character> stack  = new ArrayDeque<>();
    Scanner in  = new Scanner(System.in);
    System.out.println("Enter Characters");
    String str = in.next();
    for(char c : str.toCharArray()) {
        if (c == '{') {
            stack.push(c);
        }
        else if (c=='}')
            if(!stack.isEmpty()) {
                stack.pop();
            }
    }
    System.out.println("the code is  "+stack.isEmpty()+ "ly written");
    }
}
