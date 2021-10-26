package Base_Algorithm;

public class MaxMoney {
    public static int get(int[] array){
       return get(array,array.length-1);
    }
    private static int get(int[] array , int index){
        if (array ==null || index < 0) return 0;
        if (index ==0) return array[0];
        return Math.max(get(array,index-1) , get(array,index-2) + array[index]);
    }
}
