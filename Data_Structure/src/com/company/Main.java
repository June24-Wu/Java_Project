package com.company;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {5,3,8,4,1,2};
        System.out.println(Heap.getKthBiggestNumber(2,array));
//        int[] newArray = Heap.heapify(array);
//        System.out.println(Arrays.toString(newArray));
    }

}
