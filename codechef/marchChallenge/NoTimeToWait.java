package codechef.marchChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class NoTimeToWait {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int H = scanner.nextInt();
        int x = scanner.nextInt();
        int[] timeZones = new int[N];
        for (int i = 0; i <N; i++) {
            timeZones[i] = scanner.nextInt();
        }
        Arrays.sort(timeZones);
        if(timeZones[N-1] + x >= H){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
