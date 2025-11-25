package Stack_ArrayDeque;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class InfixToPostfix {
    static int priority(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        return 0;
    }

    static String convert(String infix) {
        Deque<Character> stack = new ArrayDeque<>();
        String postfix = "";
        for (char ch : infix.toCharArray()) {
//        for (int i = 0; i < infix.length(); i++) {
//            char ch = infix.charAt(i);
            if (ch == ' ')
                continue;
            if (Character.isLetterOrDigit(ch)) {
                postfix += ch;
            }
            else if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix += stack.pop();
                }
                stack.pop();
            }
            else {
                while (!stack.isEmpty() && priority(stack.peek()) >= priority(ch)) {
                    postfix += stack.pop();
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            postfix += stack.pop();
        }

        return postfix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter infix expression: ");
        String infix = sc.nextLine();

        String postfix = convert(infix);
        System.out.println("Postfix: " + postfix);


    }
}
