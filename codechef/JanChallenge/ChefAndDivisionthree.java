package codechef.JanChallenge;

import java.util.Scanner;

public class ChefAndDivisionthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long d = sc.nextLong();
            long[] a = new long[n];
            for (int i=0;i<n;i++)
                a[i] = sc.nextLong();
            System.out.println(MaxmNoOfContests(k,d,a));
        }
    }
    public static long MaxmNoOfContests(long k, long d, long[] a){
        long result = 0;
        long totProblems = 0;
        for (long onePersonProblem:a) {
            totProblems+=onePersonProblem;
        }
        result = totProblems/k;
        if(result>d || result==d)
            return d;
        return result;
    }
}

