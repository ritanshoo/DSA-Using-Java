package codechef.decChallange;
import java.util.ArrayList;
import java.util.Scanner;

public class VaccineDistribution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            long N = sc.nextInt();
            long D = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                int age = sc.nextInt();
                arr.add(age);
            }
            System.out.println(minmDays(arr,N,D));
        }
    }
    public static long minmDays(ArrayList<Integer> arr,long N, long D){
        long countRisk = 0;
        long countNormal = 0;
        if (D == 1)
            return N;
        for (int age: arr) {
            if (age <= 9 || age >= 80){
                countRisk++;
            }else countNormal++;
        }
        if(countRisk%D==0){
            countRisk = countRisk/D; // now countRisk contains Days for risky case
        }else if (countRisk%D!=0){
            countRisk = (countRisk/D)+1;
        }
        if(countNormal%D==0){
            countNormal = countNormal/D; // now countNormal contains Days for risky case
        }else if (countNormal%D!=0){
            countNormal = (countNormal/D)+1;
        }
        return countNormal+countRisk;
    }
}