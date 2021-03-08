package codechef.FebChallenge;
import java.util.Arrays;
import java.util.Scanner;

public class MaxFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0){
            int N = sc.nextInt();
            long A[] = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }
            System.out.println(findMaxFun(A,N));
        }
    }
    public static long findMaxFun(long[] A,int n){
        Arrays.sort(A);
        long x = A[0];
        long z = A[n-1];
        long max =0;
        for (int i = 1; i <= n-2; i++) {
            long currentSum = modDiff(x,A[i]) + modDiff(A[i],z) + modDiff(z,A[i]);
            if(currentSum > max)
                 max = currentSum;
        }
        return max;
    }

    public static long modDiff(long x,long y){
        if(x-y>0)
            return x-y;
        else
            return y-x;
    }
}