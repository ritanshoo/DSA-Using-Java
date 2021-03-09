package DynamicProgramming.DPandGreedy;

import java.util.Scanner;

public class ClimbStairs {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
//        int totalPaths = countPathsMemoization(n, new int[n+1]);
        int totalPaths = countPathsTabulation(n);
        System.out.println(totalPaths);

    }
    public static int countPathsMemoization(int n, int[] QuestionBank){
        if(n == 0){
            return 1;
        }else if(n < 0){
            return 0;
        }
        if(QuestionBank[n] > 0){
            return QuestionBank[n];
        }
        int pathsNm1 =  countPathsMemoization(n-1, QuestionBank);
        int pathsNm2 =  countPathsMemoization(n-2, QuestionBank);
        int pathsNm3 =  countPathsMemoization(n-3, QuestionBank);
        int totalPathsFromN = pathsNm1 + pathsNm2 + pathsNm3;
        QuestionBank[n] = totalPathsFromN;
        return totalPathsFromN;
    }
    public static int countPathsTabulation(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(int i = 1; i<= n; i++){
            if(i==1){
                 dp[i] = dp[i-1];
            }else if(i==2){
                dp[i] = dp[i-1] + dp[i-2];
            }else {
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            }
        }
        return dp[n];
    }
}
