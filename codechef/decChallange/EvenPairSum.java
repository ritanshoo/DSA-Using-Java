package codechef.decChallange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EvenPairSum {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(EvenPairCount(A,B));
        }
    }
    public static int EvenPairCount(int A, int B){
        if(A==1 && B==1){
            return 1;
        }
        int oddsInA =0;
        int EvenInA = 0;
        int oddsInB =0;
        int EvenInB =0;
        if(A % 2 == 0){
            oddsInA = A/2;
            EvenInA = A - oddsInA;
//                System.out.println("A is Even odds="+oddsInA+" Evens="+EvenInA);
        }else if (A % 2 != 0){
            oddsInA = A/2 + 1;
            EvenInA = A - oddsInA;
        }
        if(B % 2 == 0){
            oddsInB = B/2;
            EvenInB = B - oddsInB;
//                System.out.println("B is Even odds="+oddsInB+" Evens="+EvenInB);
        }else if (B % 2 != 0){
            oddsInB = B/2 + 1;
            EvenInB = B - oddsInB;
//                System.out.println("B is Odd and odds in B ="+oddsInB+" Evens="+EvenInB);
        }
        return ((oddsInA * oddsInB) + (EvenInA * EvenInB));
    }
}
