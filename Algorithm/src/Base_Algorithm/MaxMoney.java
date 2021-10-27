package Base_Algorithm;

public class MaxMoney {

//    递归
    public static int get(int[] array){
       return get(array,array.length-1);
    }
    private static int get(int[] array , int index){
        if (array ==null || index < 0) return 0;
        if (index ==0) return array[0];
        return Math.max(get(array,index-1) , get(array,index-2) + array[index]);
    }
//    动态规划
    public static  int getLoop(int[] newArray){
        for (int i = 0; i<newArray.length;i++){
            if (i>=2)
                newArray[i] = Math.max(newArray[i] + newArray[i-2],newArray[i-1]);
            else if (i==1)
                newArray[i] = Math.max(newArray[0],newArray[1]);
            else continue;
        }
        return newArray[newArray.length-1];
    }

//    首尾相连
    public static int getLoop2(int[] array){
        return Math.max(getLoop2(array,0,array.length-1),getLoop2(array,1,array.length));
    }
    private static  int getLoop2(int[] array , int start , int end){
        int first = array[start] , second = array[start];
        for (int i = 2; i<end;i++){
            var temp = second;
            second = Math.max(array[i] + first, second);
            first = temp;
        }
        return second;
    }
}
