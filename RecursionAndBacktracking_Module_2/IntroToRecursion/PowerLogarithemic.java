package RecursionAndBacktracking_Module_2.IntroToRecursion;

import java.util.Scanner;

public class PowerLogarithemic {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x,n));
    }
    public static int power(int x,int n){
        if(n == 0)
            return 1;
        int xpnb2 = power(x,n/2);
        int xn = xpnb2 * xpnb2;

        if(n%2==1){
            xn = xn * x;
        }
        return xn;
    }
}
