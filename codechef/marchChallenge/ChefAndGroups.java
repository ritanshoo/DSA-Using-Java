package codechef.marchChallenge;

import java.util.Scanner;

public class ChefAndGroups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0){
            String testString = sc.next();
            int count = 0;
            if(testString.charAt(0)=='1'){
                count=1;
            }
            for(int i=1;i<testString.length();i++){
                if(testString.charAt(i)=='1' && testString.charAt(i-1) != testString.charAt(i)){
                    count += 1;
                }
            }
            System.out.println(count);
        }
    }
}
