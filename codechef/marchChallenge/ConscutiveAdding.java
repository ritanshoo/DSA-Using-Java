package codechef.marchChallenge;

import java.util.Scanner;

public class ConscutiveAdding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] A = new int[r][c];
        int[][] B = new int[r][c];
        for(int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                A[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                B[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                if( A[i][j] != B[i][j]){
                    A[i][j] = B[i][j] - A[i][j];
                }
                B[i][j] = sc.nextInt();
            }
        }
    }
}
