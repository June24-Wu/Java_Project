package Base_Algorithm;

public class Fibonacci {
    public static int recursion(int index){
        if (index == 0){return 0;}
        if (index == 1){return 1;}
        return recursion(index -1) + recursion(index -2);
    }

    public static int TwoPointer(int index){
        if (index == 0){return 0;}
        else if (index == 1){return 1;}
        else {
            int low = 0 , high = 1;
            for (int i = 2;i<=index;i++){
                var temp = high;
                high = low+high;
                low=temp;
            }
            return high;
        }
    }
}
