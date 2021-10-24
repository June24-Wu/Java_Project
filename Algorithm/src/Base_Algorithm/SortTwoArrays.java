package Base_Algorithm;

public class SortTwoArrays {
    public static int[] sort1(int[] array_1 , int length_1 ,int[] array_2 , int length_2 ){
        var new_array = new int[length_1];
        System.arraycopy(array_1,0,new_array,0,length_1);
        int point1 = 0 , point2 = 0, point = 0;
        while (point1 < length_1  || point2 < length_2){
            var value1 = point1 == length_1?  Integer.MAX_VALUE:new_array[point1];
            var value2 = point2 == length_2?  Integer.MAX_VALUE:array_2[point2];
            if (value1 < value2){
                array_1[point] = new_array[point1];
                point1++;
            }
            else{
                array_1[point] = array_2[point2];
                point2++;
            }
            point++;
        }
        return array_1;
    }
}
