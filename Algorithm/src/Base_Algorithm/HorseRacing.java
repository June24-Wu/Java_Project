package Base_Algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class HorseRacing {
    public static int[] get(int[] arrayA , int[] arrayB){
        var length = arrayA.length;
        var newArrayA = arrayA.clone();
        var newArrayB = arrayB.clone();
        Queue<Integer> garbage = new LinkedList<>();
        Arrays.sort(newArrayA);
        Arrays.sort(newArrayB);
        int i =0,j=0;
        while(j < length){
            if (newArrayA[i] < newArrayB[j]){
                newArrayB[i] = newArrayB[j];
                i++;
                j++;
            }
            else {
                garbage.add(newArrayB[j]);
                j++;
            }
        }
        while (i < length){
            newArrayB[i] = garbage.poll();
            i++;
        }
        return newArrayB;
    }
}
