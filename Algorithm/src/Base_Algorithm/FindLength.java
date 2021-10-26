package Base_Algorithm;

public class FindLength {
    public static int find(int[] array){
        int slow = 0 , fast = 1;
        var length = 0;
        while (fast <= array.length -1) {
            if (array[fast-1] < array[fast]) {
                fast++;
            }
            else{
                length = Integer.max(length,fast - slow);
                slow = fast;
                fast ++;
            }
        }
        return Integer.max(length,fast - slow);
    }
}
