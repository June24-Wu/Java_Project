package com.company;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node{
        private int value;
        public Node next;
        public Node(int value) {
            this.value = value;
        }
    }
    private Node first;
    private Node last;

    public void addLast(int item){
        var node = new Node(item);
        if (isEmpty()){
            first = last = node;
        }
        else {
            last.next = node;
            last = node;
        }
    }
    public void addFirst(int item){
        var node = new Node(item);
        if (isEmpty()){
            first = last = node;
        }
        else {
            node.next = first;
            first = node;
        }
    }
    public int indexOf(int item){
        int index = 0 ;
        var current = first;
    while (current != null) {
        if (current.value == item) return index;
        current = current.next;
        index++;
        }
    return -1;
    }
    public boolean contains(int item) {
        return this.indexOf(item) != -1;
    }
    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (first.next == null) {
            first = last = null;
            return;
        }
        var second = first.next;
        first.next = null;
        first.next = second;
    }
    public void removeLast() {
        if (isEmpty()) throw new NoSuchElementException();
        if (first == last) {
            first = last = null;
            return;
        }
        var current = first;
        while (current != null){
            if (current.next != last) {
                current = current.next;
                continue;
            }else{
                break;
            }
        }
        current.next = null;
        last = current;
    }
    public boolean isEmpty(){
        return first == null;
    }
}
