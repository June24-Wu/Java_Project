package com.company;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    Node root;
    private class Node{
        int value;
        Node leftChild;
        Node rightChild;
        public Node(int value) {
            this.value = value;
        }
    }
    public boolean isEmpty(){return root == null;}
    public void add(int item){
        if (isEmpty()) {
            root = new Node(item);
            return;
        }
        var node = root;
        while (true) {
            if (item < node.value)
                if (node.leftChild != null)
                    node = node.leftChild;
                else {
                    node.leftChild = new Node(item);
                    break;
                }
            if (item > node.value)
                if (node.rightChild != null)
                    node = node.rightChild;
                else {
                    node.rightChild = new Node(item);
                    break;
                }
        }
    }
    public boolean isCBT(){
        Queue<Node> queue = new LinkedList<>();
        boolean isLeaf = false;
        queue.add(root);
        while(!queue.isEmpty()){
            var head = queue.poll();
            if ((head.rightChild != null && head.leftChild == null) ||(isLeaf && head.leftChild != null && head.rightChild != null))
                return false;
            else {
                if (head.leftChild != null)
                    queue.add(head.leftChild);
                if (head.rightChild != null)
                    queue.add(head.rightChild);
            }
            if (head.leftChild == null || head.rightChild == null)
                isLeaf = true;
        }
        return true;
    }

    public boolean  inOrderTraverse(){
        return inOrderTraverse(root);
    }
    private boolean inOrderTraverse(Node root){
        var preValue = Integer.MIN_VALUE;
        if (root == null)
            return false;
        if (root.leftChild != null)
            inOrderTraverse(root.leftChild);
        if (preValue < root.value)
            preValue = root.value;
        else
            return false;
        if (root.rightChild != null)
            inOrderTraverse(root.rightChild);
        return true;
    }

//    深度优先找到最小深度
    public int minDepth(){return minDepth(root);}
    private int minDepth(Node root){
        if (root.leftChild == null && root.rightChild == null)
            return 1;
        if (root.leftChild == null)
            return minDepth(root.rightChild) +1;
        if (root.rightChild == null)
            return minDepth(root.leftChild) +1;
        return Integer.min(minDepth(root.leftChild), minDepth(root.rightChild)) +1;
    }

//    public int minDepth2(){return minDepth2(root);}
//    private int minDepth2(Node root){
//        Queue queue = new LinkedList();
//        var depth =1;
//        queue.add(new Array[]{root,depth});
//        while (queue != null){
//            var node = queue.poll();
//
//        }
//    }
}
