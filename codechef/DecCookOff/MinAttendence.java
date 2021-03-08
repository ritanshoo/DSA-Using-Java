package codechef.DecCookOff;

import java.util.Scanner;

public class MinAttendence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String b = sc.next();
            // sc.next();
            System.out.println(Result(n,b));
        }
    }
    public static String Result(int n,String b){
        int currAttendence=0;
        int remdays = 120 - n;
        for(int i=0;i<b.length();i++){
            if ( b.charAt(i)== '1'){
                currAttendence+=1;
            }
        }
        int MaxAttendence = currAttendence + remdays;
        int MaxAttendencePerCent = (MaxAttendence*100)/120;
        if (MaxAttendencePerCent>=75){
            return "YES";
        }
        else {
            return "NO";
        }
    }
}
