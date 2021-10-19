package com.company;

public class BinaryTree {
    Node root;
    private class Node{
        int value;
        public Node leftChild;
        public Node rightChild;

        public Node(int value) {
            this.value = value;
        }
    }

    public BinaryTree(int value) {
        this.root = new Node(value);
    }

    public void add(int item){
        var current = root;
        while (true){
            if (item < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = new Node(item);
                    break;
                }
                current = current.leftChild;
            }
            if (item > current.value) {
                if (current.rightChild == null) {
                    current.rightChild = new Node(item);
                    break;
                }
                current = current.rightChild;
            }
            if (item == current.value)
                throw new IllegalArgumentException("The value has already exists");
            }
        }
    public int find(int item){
        int location = 1;
        var current = root;
        while (current!= null){
            if (item < current.value) {
                if (current.leftChild == null) {
                    throw new IllegalArgumentException("no such value");
                }
                current = current.leftChild;
                location  = 2*location -1;
            }
            if (item > current.value) {
                if (current.rightChild == null) {
                    throw new IllegalArgumentException("no such value");
                }
                current = current.rightChild;
                location = location*2;
            }
            if (item == current.value)
                return location;
        }
        return location;

    }
}
