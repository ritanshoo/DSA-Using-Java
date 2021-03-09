package DynamicProgramming.DPandGreedy;

import java.util.Scanner;

public class MinimumCostPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] costArr = new int[n][m];
        for (int i = 0; i < costArr.length; i++) {
            for (int j = 0; j < costArr[0].length; j++) {
                costArr[i][j] = sc.nextInt();
            }
        }
        int[][] dp = new int[n][m];
        for (int i = dp.length-1; i >= 0; i--) {
            for (int j = dp[0].length-1; j >= 0; j--) {
                // for last cell
                if (i == dp.length-1 && j == dp[0].length-1){
                    dp[i][j] = costArr[i][j];
                }
                //for last row
                else if (i == dp.length-1){
                    dp[i][j] = dp[i][j+1] + costArr[i][j];
                }
//                for last column
                else if (j == dp[0].length-1){
                    dp[i][j] = dp[i+1][j] + costArr[i][j];
                }
//                for the rest matrix
                else{
                    dp[i][j] = Math.min(dp[i+1][j], dp[i][j+1]) + costArr[i][j];
                }
            }
        }
        System.out.println(dp[0][0]);
    }
}
