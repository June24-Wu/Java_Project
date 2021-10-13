package com.company;

import java.util.Stack;

public class StringReverse {
    public String reverse(String input){
        Stack<Character> stack = new Stack<>();
        for (Character a : input.toCharArray())
            stack.push(a);
        StringBuffer reversed = new StringBuffer();
        while (!stack.empty())
           reversed.append(stack.pop());
        return reversed.toString();
    }
    public boolean isBalanced(String input){
        Stack<Character> stack = new Stack<>();
        for (Character a : input.toCharArray()) {
            if (a == '(')
                stack.push(a);
            if (a == ')'){
                if (stack.empty()) return false;
                if (stack.pop() == '('){
                    continue;}
                else return false;
            }
        }
        return stack.empty();
    }
}
