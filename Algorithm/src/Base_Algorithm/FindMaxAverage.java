package Base_Algorithm;

public class FindMaxAverage {
    public static float find(int[] array,int num){
        var point1 = 0;
        float sum = 0;
        for (var item = 0 ; item < num;item++){
            sum += array[item];
        }
        for (var point2 = num;point2<array.length;point2++){
            point1 = point2 - num;
            if (array[point2] > array[point1])
                sum = sum +array[point2] - array[point1];
        }
        return sum / num;
    }
}
