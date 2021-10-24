package com.company;

import java.util.*;

public class Graph {
    private class Node{
        String label;

        @Override
        public String toString() {
            return label;
        }

        public Node(String label) {
            this.label = label;

        }
    }
    private Map<String,Node> nodes = new HashMap<>();
    private Map<Node, List<Node>> adjancencyList = new HashMap<>();
    public void add(String item){
        Node node = new Node(item);
        nodes.putIfAbsent(item,node);
        adjancencyList.putIfAbsent(node, new ArrayList<>());
    }
    public void addEdge(String from,String to){
        var fromNode = nodes.get(from);
        if (fromNode == null)
            throw new IllegalArgumentException("no such from");
        var toNode = nodes.get(to);
        if (toNode == null)
            throw new IllegalArgumentException("no such from");
        adjancencyList.get(fromNode).add(toNode);
    }
    public void print(){
        for (var source : adjancencyList.keySet()){
            var targets = adjancencyList.get(source);
            if (!targets.isEmpty())
                System.out.println((source + " is connected with " + targets));
        }
    }
    public void remove(String item){
        var node = nodes.get(item);
        if (node == null)
            return;
        for (var n: adjancencyList.keySet())
            adjancencyList.get(n).remove(node);
        adjancencyList.remove(node);
        nodes.remove(item);
    }
    public void removeEdge(String from,String to){
        var fromNode = nodes.get(from);
        var toNode = nodes.get(to);
        if (fromNode == null || toNode == null)
            return;
        adjancencyList.get(fromNode).remove(toNode);
    }
}
