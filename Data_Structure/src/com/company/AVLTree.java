package com.company;

public class AVLTree {
    private class AVLNode{
        int value;
        int height;
        int balanceFactor;
        AVLNode leftChild;
        AVLNode rightChild;
        public AVLNode(int value) {
            this.value = value;
        }
    }
    private AVLNode root;
    public void insert(int item){
        root = insert(root,item);
    }
    private int getHeight(AVLNode root){
        return root == null ? -1 : root.height;
    }
    private int balanceFactor(AVLNode root){
        return getHeight(root.leftChild) - getHeight(root.rightChild);
    }
    private boolean isLeftHeavy(AVLNode root){
        return balanceFactor(root) > 1;
    }
    private boolean isRightHeavy(AVLNode root){
        return balanceFactor(root) < -1;
    }

    private AVLNode LeftRotation(AVLNode root){
        var newRoot = root.rightChild;
        root.rightChild = newRoot.leftChild;
        newRoot.leftChild = root;
        SetHeight(newRoot);
        SetHeight(root);
        return newRoot;
    }
    private AVLNode RightRotation(AVLNode root){
        var newRoot = root.leftChild;
        root.leftChild = newRoot.rightChild;
        newRoot.rightChild = root;
        SetHeight(newRoot);
        SetHeight(root);
        return newRoot;
    }
    private AVLNode SetHeight(AVLNode root){
        root.height = Math.max(getHeight(root.leftChild),getHeight(root.rightChild)) + 1;
        return root;
    }
    private AVLNode Balaced(AVLNode root){
        root.balanceFactor = balanceFactor(root);
        if (isLeftHeavy(root)) {
            if (root.leftChild.balanceFactor == 1) {
//                System.out.println(root.value + " needs right rotation");
                root = RightRotation(root);
            } else {
//                System.out.println(root.leftChild.value + " needs left rotation");
                root.leftChild = LeftRotation(root.leftChild);
//                System.out.println(root.value + " needs right rotation");
                root = RightRotation(root);
            }
        }
        if (isRightHeavy(root)){
            if (root.rightChild.balanceFactor == 1) {
//                System.out.println(root.rightChild.value + " needs right rotation");
                root.rightChild = RightRotation(root.rightChild);
//                System.out.println(root.value + " needs left rotation");
                root = LeftRotation(root);
            } else {
//                System.out.println(root.value + " needs left rotation");
                root = LeftRotation(root);
            }
        }
        return root;
    }
    private AVLNode insert(AVLNode root,int item){
        if (root == null) {
            return new AVLNode(item);
        }
        if (item < root.value) {
            root.leftChild = insert(root.leftChild,item);
        }
        if (item > root.value) {
            root.rightChild =insert(root.rightChild,item);
        }
        root = Balaced(root);

        return root;
    }

}
