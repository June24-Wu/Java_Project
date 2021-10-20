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
    public void traversePreOrder(){
        traversePreOrder(root);
    }
    private void traversePreOrder(Node root){
        if (root ==null)
            return;
        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    public void traverseInOrder(){
        traverseInOrder(root);
    }
    private void traverseInOrder(Node root){
        if (root ==null)
            return;
        traverseInOrder(root.leftChild);
        System.out.println(root.value);
        traverseInOrder(root.rightChild);
    }
    public int min(){
        return min(root);
    }
    private int min(Node root){
        if (root.leftChild == null)
            return root.value;
        return min(root.leftChild);
    }

    public void printNodesAtDistance(int distance){
        printNodesAtDistance(root,distance);
    }
    private void printNodesAtDistance(Node root, int distance){
        if (root == null)
            return;
        if (distance == 0) {
            System.out.println(root.value);
            return;
        }
        printNodesAtDistance(root.leftChild,distance-1);
        printNodesAtDistance(root.rightChild,distance-1);
    }


}
