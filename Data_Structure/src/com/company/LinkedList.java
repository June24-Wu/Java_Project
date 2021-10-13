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
    public void reverse(){
        if (isEmpty()) throw new NoSuchElementException();
        var previous = first;
        var current = first.next;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = previous;
    }
    public int getKthFromTheEnd(int k){
        if (isEmpty()) throw  new NoSuchElementException();
        if (k< 0)
            throw new IllegalArgumentException("please enter a numbe that > 0 ");
        var a = first;
        var b = first;
        for(int i=0;i<k-1;i++){
            b = b.next;
            if (b == null)
                throw new IllegalArgumentException("The k is longer than the linked list");
        }
        while (b.next != null) {
            a = a.next;
            b = b.next;
        }
        return a.value;
    }
}
