package RecursionAndBacktracking_Module_2.RecursionInArrays;

import java.util.Scanner;

public class DisplayArrayInReverse {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            DisplayArrayReverse(arr,0);
    }
    public static void DisplayArrayReverse(int[] arr, int index){
        if(index == arr.length)
            return;
        DisplayArrayReverse(arr,index+1);
        System.out.print(arr[index]+" ");
    }
}
