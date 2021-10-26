package Base_Algorithm;

public class ChampagneTower {
    public static double get(int pour , int array , int column){
        double[][] dp = new double[100][100];
        dp[0][0] = pour;
        for (int i =0; i <= array;i++){
            for (int j =0; j <= i;j++){
                if (dp[i][j] <= 1) continue;
                else {
                    dp[i+1][j] += (dp[i][j] - 1)/2;
                    dp[i+1][j+1] += (dp[i][j] - 1)/2;
                }
            }
        }
        return Math.min(dp[array-1][column-1],1);
    }
}
