package Leetcode;
import java.util.Arrays;
public class HighestAltitude {
    public static void main(String[] args) {
        int gain[] = {-5,1,5,0,-7};
        System.out.println("max -> "+maxAltitude(gain));
    }
    public static int maxAltitude(int[] arr){
        int altitude[] = new int[arr.length+1];
        altitude[0] = 0;
        altitude[1] = arr[0];
        for(int i=2;i< altitude.length;i++){
            altitude[i]=altitude[i-1]+arr[i-1];
        }
        for (int i = 0; i <= altitude.length - 1; i++) {
            System.out.print(altitude[i]+" ");
        }
        Arrays.sort(altitude);
        return altitude[altitude.length-1];
    }
}
