package Base_Algorithm;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class GetProvince {
//    广度优先遍历
    public static int get(int[][] arrays){
        Stack<Integer> stack = new Stack<>();
        Set<Integer> set = new HashSet<>();
        int count = 0 ;
        for(int i = 0 ;i< arrays.length;i++){
            if (set.contains(i))
                continue;
            set.add(i);
            stack.add(i);
            while(!stack.isEmpty()){
                i = stack.pop();
                for (int j = 0 ; j < arrays[i].length; j++){
                    if (i == j) continue;
                    if (arrays[i][j] == 1){
                        stack.add(i);
                        stack.add(j);
                        set.add(j);
                        arrays[i][j] = 0;
                    }
                }
            }
            count++;
        }
        return count;
    }

//    深度优先遍历
    public static int get2(int[][] arrays){
        Set<Integer> set = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        for (int i = 0 ; i< arrays.length;i++){
            if (set.contains(i)) continue;
            stack.add(i);
            while (!stack.isEmpty()){
                i = stack.pop();
                for (int j = 0  ; j< arrays.length;j++){
                    if (i == j) continue;
                    if (arrays[i][j] ==1){
                        arrays[i][j] = 0;
                        arrays[j][i] = 0;
                        stack.add(j);
                        set.add(j);
                    }
                }
            }
            count++;
        }
        return count;
    }
}
