package Base_Algorithm;

public class ArrangeCoin {
    public static int iteration(int coinNum){
        var columns = 0;
        while(true){
            columns++;
            if (coinNum >= columns ){
                coinNum -= columns;
                continue;
            }
            break;
        }
        return columns -1 ;
    }
}
