package RecursionAndBacktracking_Module_2.RecursionInArrays;

import java.util.Scanner;

public class MaxOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxOfArray(arr,0));
    }
    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length-1)
            return arr[idx];
        maxOfArray(arr,idx+1);

        // return Math.max(arr[idx],maxOfArray(arr,idx+1)); this line takes more time

        if(arr[idx]>maxOfArray(arr,idx+1))
            return arr[idx];
        else
            return maxOfArray(arr,idx+1);
    }
}
