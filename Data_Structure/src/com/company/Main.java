package com.company;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(7);
        binaryTree.add(4);
        binaryTree.add(9);
        binaryTree.add(1);
        binaryTree.add(6);
        binaryTree.add(8);
        binaryTree.add(10);
        binaryTree.printNodesAtDistance(4);
//        System.out.println(linkedlist.indexOf(3));
//        System.out.println(linkedlist.contains(2));
    }

}
