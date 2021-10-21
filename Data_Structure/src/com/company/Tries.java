package com.company;

public class Tries {
    public static int size = 26;
    private class Node{
        public char value;
        public Node[] children = new Node[26];
        public boolean isEndOfWord;
        public Node(char value) {
            this.value = value;
        }
    }
    private Node root = new Node(' ');
    private int indexOfCh(char ch){ return ch - 'a';}
    public void insert(String word){
        var current = root;
        for (char ch : word.toCharArray()) {
            var index = indexOfCh(ch);
            if (current.children[index] == null)
                current.children[index] =new Node(ch);
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }
    public boolean contain(String value){
        var current = root;
        for (char ch : value.toCharArray()){
            var ch_index = indexOfCh(ch);
            if (current.children[ch_index] == null)
                return false;
            else
                current = current.children[ch_index];
        }
        return current.isEndOfWord;
    }

    public void traverse(){
        traverse(root);
    }
    private Node getChildren(Node root){
        root.children.values
    }
    private void traverse(Node root){
        System.out.println(root.value);

    }
}
