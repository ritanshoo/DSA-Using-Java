package RecursionAndBacktracking_Module_2.RecursionWithArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<String> paths = getMazePaths(1, 1, n, m);
        System.out.println(paths);
    }
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc){
        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> Hpaths = new ArrayList<>();
        ArrayList<String> Vpaths = new ArrayList<>();
        if(sc < dc)
            Hpaths = getMazePaths(sr,sc+1, dr,dc);
        if(sr < dr)
            Vpaths = getMazePaths(sr+1,sc,dr,dc);

        ArrayList<String> paths = new ArrayList<>();
        for(String Hpath:Hpaths){
            paths.add("h"+Hpath);
        }
        for(String Vpath:Vpaths){
            paths.add("v"+Vpath);
        }
        return paths;
    }

}
