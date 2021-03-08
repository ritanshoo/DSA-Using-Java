package RecursionAndBacktracking_Module_2.IntroToRecursion;

import java.util.Scanner;
public class PrintDecresing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintDecreasing(n);
    }
    public static void PrintDecreasing(int n){
        if (n==0)
            return;
        System.out.println(n);
        PrintDecreasing(n-1);
    }
}
