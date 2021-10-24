package Base_Algorithm;

import java.util.HashMap;
import java.util.Map;

/*给定一个数组
返回sum等于target的下标*/
public class Sum {
    public static int[] Sum(int[] array,int target){
        var index = 0;
        Map<Integer,Integer> hash = new HashMap<>();
        for (int item : array){
            hash.put(item,index);
            index++;
            if (hash.containsKey(target - item) && hash.get(item) != hash.get(target-item))
                return new int[]{hash.get(item),hash.get(target-item)};
            else
                continue;
        }
        return null;
    }
}
