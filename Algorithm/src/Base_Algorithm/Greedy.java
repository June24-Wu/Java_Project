package Base_Algorithm;

import java.util.Arrays;

public class Greedy {
//    柠檬水找零钱
    public static boolean money(int[] array){
        int money5 = 0,money10 = 0;
        for (int item: array){
            if (item == 5)
                money5++;
            if (item == 10){
                if (money5 == 0 )
                    return false;
                else{
                    money10++;
                    money5--;
                }
            }
            if (item == 20){
                if (money10 != 0){
                    if (money5!=0){
                        money5--;
                        money10--;
                    }
                    else return false;
                }
                else{
                    if(money5>=3)
                        money5 -= 3;
                    else return false;
                }
            }
        }
        return true;
    }
//找到一个数组里能组成三角形并且周长最大（排序+贪心）
    public static int LargestPerimeter(int[] array){
        Arrays.sort(array);
        for (int i = array.length -1;i>=2;i--){
            if (array[i-1] + array[i-2] > array[i])
                return array[i] + array[i-1] + array[i-2];
            else continue;
        }
        return -1;
    }
}
