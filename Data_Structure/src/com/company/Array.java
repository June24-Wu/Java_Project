package com.company;

public class Array {
    private int[] array;
    private int count;


    public Array(int length) {
        this.array = new int[length];
    }
    public void  print(){
        for(int i = 0;i< count;i++)
            System.out.println(array[i]);
    }
    public void insert(int item) {
        if (count == array.length) {
            int[] newArray = new int[count * 2];
            for (int i = 0 ; i< count;i++)
                newArray[i] = array[i];
            this.array = newArray;
        }
        array[count] = item;
        count ++;
    }
    public void removeAt(int index) throws IllegalAccessException {
        if (index<0 || index >= count){
            throw new IllegalAccessException();
        } else {
            for (int i=index;i<count;i++)
                array[i] = array[i+1];
            count--;
        }
    }
    public int indexOf(int number){
        int index = -1;
        for (int i = 0; i < count;i++)
            if(array[i] == number){
                index = i;
                break;
            }else{continue;}
        return index;
    }
}
