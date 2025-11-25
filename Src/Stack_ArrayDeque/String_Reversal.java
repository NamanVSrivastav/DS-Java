package Stack_ArrayDeque;

import Stack_Examples.Stack_Class;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class String_Reversal {
    public static void main(String[] args) {
        Deque<Character> stack=new ArrayDeque<>();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string:");
        String word=in.next();
        String rword="";

//        String word = "program";
        for(char c :word.toCharArray()){
//            System.out.println(c);
            stack.push(c);
        }
        while (!stack.isEmpty()){

//            System.out.print(stack.pop());
            rword += stack.pop();
        }
        System.out.println("rword:"+rword);
        System.out.println("word id palindrome: "+rword.equals(word));

//        System.out.println(stack);
    }
}
