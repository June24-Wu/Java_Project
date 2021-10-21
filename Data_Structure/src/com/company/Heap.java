package com.company;

import java.util.ArrayList;

public class Heap {
    private ArrayList<Integer> items = new ArrayList<>();
    public int getSize(){return items.size();}
    private void swap(int first,int second){
        var temp = items.get(first);
        items.set(first,items.get(second));
        items.set(second,temp);
    }
    public void insert(int item){
        items.add(item);
        var index = items.indexOf(item);
        while (index > 0 && item > items.get((index-1)/2)){
            var parentIndex = (index - 1) / 2;
            swap(index,parentIndex);
            index = parentIndex;
        }
    }
    public int remove(){
        if (items.isEmpty())
            throw new IllegalArgumentException("The Heap is empty");
        var root = items.get(0);
        items.set(0,items.get(items.size() -1));
        items.remove(items.size()-1);
        var index = 0;
        while (index < items.size() && !isValidHeap(index)){
            swap(index,getLargerChildIndex(index));
            index = getLargerChildIndex(index);
        }
    return root;
    }
    private boolean isValidHeap(int index){
        if (leftChildIndex(index) > items.size() - 1)
            return true;
        if (rightChildIndex(index) > items.size() - 1 && items.get(index) >= items.get(leftChildIndex(index)))
            return true;
        return items.get(index) >= items.get(leftChildIndex(index))
                && items.get(index) >= items.get(rightChildIndex(index));
    }
    private int leftChildIndex(int index){return index *2 +1;}
    private int rightChildIndex(int index){return index *2 +2;}
    private int getLargerChildIndex(int index) {
        if (leftChildIndex(index) > items.size())
            return index;
        if (rightChildIndex(index) > items.size())
            return leftChildIndex(index);
        return items.get(leftChildIndex(index)) > items.get(rightChildIndex(index)) ? leftChildIndex(index) : rightChildIndex(index);
    }
    public static int[] heapify(int[] array){
        int [] newArray = new int[array.length];
        var heap = new Heap();
        for (int item : array) {
            heap.insert(item);
        }
        int index = 0;
        for (int i : array) {
            newArray[index] = heap.remove();
            index++;
        }
        return newArray;
    }
    public static int getKthBiggestNumber(int k,int[] array){
        array = Heap.heapify(array);
        return array[k-1];
    }
}

