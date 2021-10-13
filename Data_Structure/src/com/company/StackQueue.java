package com.company;

import java.util.Stack;

public class StackQueue {
    private  Stack<Integer> stack;

    public StackQueue() {
        this.stack = new Stack<Integer>();
    }
    public void enqueue(int item){
        stack.push(item);
    }

    public void dequeue(){
        var newStack = new Stack<Integer>();
        while (!stack.isEmpty()){
            newStack.push(stack.pop());
        }
        newStack.pop();
        while (!newStack.isEmpty()){
            stack.push(newStack.pop());
        }
    }
    @Override
    public String toString() {
        return stack.toString();
    }
}
