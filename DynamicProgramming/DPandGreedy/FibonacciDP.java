package DynamicProgramming.DPandGreedy;

import java.util.Scanner;

public class FibonacciDP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int fibn = fibonacci(n);
//        System.out.println(fibn);
        int fibnUsingDP = fibonacciUsingMemoization(n, new int[n+1]);
        System.out.println(fibnUsingDP);
    }
    public static int fibonacci(int n){
        if(n == 0 || n == 1)
            return n;
        int fibnm1 = fibonacci(n-1);
        int fibnm2 = fibonacci(n-2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }
    public static int fibonacciUsingMemoization(int n, int[] QuestionBank){
        if(n == 0 || n == 1)
            return n;
        if(QuestionBank[n] != 0){
            return QuestionBank[n];
        }
        int fibnm1 = fibonacci(n-1);
        int fibnm2 = fibonacci(n-2);
        int fibn = fibnm1 + fibnm2;
        QuestionBank[n] = fibn;
        return fibn;
    }
}
