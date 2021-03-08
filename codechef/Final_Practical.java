package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class Final_Practical {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int[] myArr = new int[size];
        System.out.println("enter array elements");
        for (int i = 0; i < size; i++) {
            myArr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < (size - i - 1); j++) {
                if (myArr[j] > myArr[j + 1]) {
                    int temp = myArr[j];
                    myArr[j] = myArr[j + 1];
                    myArr[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("ROHIT SHARMA 19BCS2882");
        System.out.println();
        // now accessing required numbers
        System.out.println("Smallest two numbers of given array are "+myArr[0]+" "+myArr[1]);
        System.out.println("Largest two numbers of given array are "+myArr[myArr.length-1]+" "+myArr[myArr.length-2]);

    }
}
