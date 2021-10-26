package Base_Algorithm;

public class CanWin {
    public static void recursion(int[] array){
        int sum = 0;
        for (int i : array)
            sum += i;
        int score = recursion(array,0,array.length-1);
        System.out.println(score > sum-score);
    }
    private static int recursion(int[] array , int first , int last){
        int sLeft = 0 , sRight = 0;
        if (first == last) {return array[first];}
        if (last - first ==1) {
            sLeft = array[first];
            sRight = array[last];
        }else if (last - first >=2){
            sLeft = array[first] + Math.min(recursion(array, first + 2, last), recursion(array, last - 1, first + 1));
            sRight = array[last] + Math.min(recursion(array, first+1, last - 1), recursion(array, last - 2, first));
        }
        return Math.max(sLeft,sRight);
    }
}
