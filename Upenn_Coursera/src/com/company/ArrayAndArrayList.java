package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ArrayAndArrayList {

    /**
     * Counts the number of occurrences of the given element in the given array.
     *
     * Example(s):
     * - For a defined array: int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
     * - Calling howMany(array, 1) would return 2
     * - Calling howMany(array, 10) would return 0
     *
     * - For a defined array: int[] array = new int[0];
     * - Calling howMany(array, 1) would return 0
     *
     * @param array to search
     * @param element to search for
     * @return number of times element is in array
     */
    public int howMany(int[] array, int element) {
        // TODO Implement method
        HashMap<Integer,Integer> hash = new HashMap<>();
        for (int item:array){
            if (hash.containsKey(item)) hash.put(item,hash.get(item)+1);
            else hash.put(item,1);
        }
        return hash.get(element);
    }

    /**
     * Finds the max number in the given array.
     * If the array is empty, returns -1.
     *
     * Example(s):
     * - For a defined array: int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
     * - Calling findMax(array) would return 9
     *
     * - For a defined array: int[] array = {2, 4, 8, 12, 12, 4};
     * - Calling findMax(array) would return 12
     *
     * - For a defined array: int[] array = new int[0];
     * - Calling findMax(array) would return -1
     *
     * @param array to search
     * @return max number in array
     */
    public int findMax(int[] array) {
        // TODO Implement method
        int max = -1;
        if (array.length == 0)
            return max;
        else{
            for (int item:array){
                if (item > max) max = item;
            }
        }
        return max;
    }

    /**
     * Keeps track of every occurrence of the max number in the given array.
     * Returns an ArrayList that contains every occurrence of the max number.
     * Uses the findMax(int[] array) method.
     * If the array is empty, returns null.
     *
     * Example(s):
     * - For a defined array: int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
     * - Calling maxArray(array) would return an ArrayList containing 9
     *
     * - For a defined array: int[] array = {2, 4, 8, 12, 12, 4};
     * - Calling maxArray(array) would return an ArrayList containing 12 and 12
     *
     * - For a defined array: int[] array = new int[0];
     * - Calling maxArray(array) would return null
     *
     * @param array to search
     * @return ArrayList containing every instance of the max
     */
    public ArrayList<Integer> maxArray(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        var newArray = array.clone();
        Arrays.sort(newArray);
        var max = newArray[newArray.length-1];
        for (int index = newArray.length-1;index>=0;index--){
            if (newArray[index] == max) arrayList.add(max);
        }
        // TODO Implement method
        return arrayList;
    }

    /**
     * Puts all of the zeros in the given array, at the end of the given array.
     * Updates the array itself.
     * Maintains the order of the non-zeros.
     *
     * Example(s):
     * - For a defined array: int[] array = {0, 1, 0, 2, 0, 3, 0, 5};
     * - Calling swapZero(array) would change the array to be: {1, 2, 3, 5, 0, 0, 0, 0};
     *
     * - For a defined array: int[] array = {1, 3, 5, 7, 9, 10};
     * - Calling swapZero(array) wouldn't change the array, it would still be: {1, 3, 5, 7, 9, 10};
     *
     * - For a defined array: int[] array = new int[0];
     * - Calling swapZero(array) wouldn't change the array, it would still be empty
     *
     * @param array to search for zeros
     */
    public void swapZero(int[] array) {
        // TODO Implement method
        var newArray = array.clone();
        Arrays.sort(newArray);
        var index = 0;
        for (int item:newArray){
            if (item != 0){
                array[index] = item;
                index++;
            }
        }
        while (index < array.length){
            array[index] = 0;
            index++;
        }
    }
}
