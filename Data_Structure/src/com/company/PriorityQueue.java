package com.company;

import java.util.Arrays;

public class PriorityQueue {
    int[] array;
    private int total_count = 0;
    public PriorityQueue(int length) {
        this.array = new int[length];
    }
    public PriorityQueue() {
        this.array = new int[5];
    }
    public void add(int item){
        if (total_count == array.length) throw new IllegalArgumentException("PriorityQueue over flow!");
        int tick = 0;
        for (int i = total_count-1; i>=0 ;i--){
            if (item < array[i]){
                array[i+1] = array[i];
                tick++;
            }
            else break;
            }
        array[total_count-tick] = item;
        total_count++;
        }
    @Override
    public String toString(){
        return Arrays.toString(array);
    }
}


