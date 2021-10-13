package com.company;

import java.util.Arrays;

public class ArrayQueue {
    private int[] array;
    private int front = 0;
    private int rear = 0;
    private int count = 0;
    int total_length = 0 ;
    public ArrayQueue(int length) {
        this.array = new int[length];
        this.total_length = length;
    }
    public ArrayQueue() {
        this.array = new int[5];
        this.total_length = 5;
    }
    public void enqueue(int item) {

        if (count == array.length)
            throw new IllegalStateException("The Queue is over flow");
        array[rear % total_length] = item;
        rear++;
        count++;
    }
    public void dequeue(){
        if (count ==0)
            throw new IllegalStateException("The Queue is empyt");
        if (front == rear)
            throw new IllegalStateException("Queue is empty");
        array[front % total_length] = 0;
        front++;
        count--;
    }

    public boolean isEmpty() {
        return count == 0;
    }
    @Override
    public String toString(){
        return Arrays.toString(array);
    }
}

