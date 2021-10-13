package com.company;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        var stackQueue = new StackQueue();
        stackQueue.enqueue(1);
        stackQueue.enqueue(2);
        stackQueue.enqueue(3);
        stackQueue.enqueue(4);
        stackQueue.enqueue(5);
        stackQueue.enqueue(6);
        stackQueue.enqueue(7);
        stackQueue.dequeue();
//        System.out.println(stackQueue.isEmpty());
        System.out.println(stackQueue);

//        System.out.println(linkedlist.indexOf(3));
//        System.out.println(linkedlist.contains(2));
    }

}
