package RecursionAndBacktracking_Module_2.IntroToRecursion;

import java.util.Scanner;

public class printIncDec {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    pdi(n);
    }
    public static void pdi(int n){
        if(n==0)
            return;
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }
}
