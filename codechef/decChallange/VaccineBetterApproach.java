package codechef.decChallange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VaccineBetterApproach {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().split(" ");
        int d1 = Integer.parseInt(parts[0]);
        int v1 = Integer.parseInt(parts[1]);
        int d2 = Integer.parseInt(parts[2]);
        int v2 = Integer.parseInt(parts[3]);
        int p = Integer.parseInt(parts[4]);

        if(d1 == 1 && d2 == 1){
            if(p % (v1+v2) == 0)
                System.out.println(p/(v1+v2));
            else System.out.println(p/(v1+v2) + 1); ;
        }else if(d1 > d2){
            int remWork = p - (v2 * (d1-d2));
            if(remWork % (v1+v2) == 0){
                System.out.println(remWork / (v1+v2) + (d1 - 1));
            } else System.out.println((remWork / (v1+v2) + 1) + (d1 - 1));
        }else if(d2 > d1){
            int remWork = p - (v2 * (d2-d1));
            if(remWork % (v1+v2) == 0)
                System.out.println((remWork / (v1+v2)) + (d2 - 1));
            else System.out.println((remWork / (v1+v2) + 1) + (d2 - 1));
        }else{
            if(p%(v1+v2) == 0)
                System.out.println((p/(v1+v2)) + (d1-1));
            else System.out.println((p/(v1+v2) +1) + (d1-1));
        }
    }
}
