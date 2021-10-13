package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class AStack {
    ArrayList array;
    int top;
    public AStack(int length) {
        this.array = new ArrayList(length);
    }
    public AStack(){
        this.array = new ArrayList(10);
    }
    public void push(int item) {
        this.array.add(item);
        top = item;
    }
    public void pop(){
        this.array.remove(top);
    }
}
