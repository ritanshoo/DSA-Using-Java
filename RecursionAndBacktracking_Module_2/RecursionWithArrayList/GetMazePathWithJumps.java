package RecursionAndBacktracking_Module_2.RecursionWithArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathWithJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> paths = getMazePathWithJumps(1,1, n, m);
        System.out.println(paths);
    }
    public static ArrayList<String> getMazePathWithJumps(int sr, int sc, int dr, int dc){
        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> paths = new ArrayList<>();

        // horizontal moves
        for(int H_moveSize = 1; H_moveSize <= dc - sc; H_moveSize++){
            ArrayList<String> H_paths = getMazePathWithJumps(sr, sc + H_moveSize,dr,dc);
            for (String Hpath:H_paths){
                paths.add("h" + H_moveSize + Hpath);
            }
        }
        // Vertical moves
        for(int V_moveSize = 1; V_moveSize <= dr - sr; V_moveSize++){
            ArrayList<String> V_paths = getMazePathWithJumps(sr + V_moveSize, sc ,dr,dc);
            for (String Vpath:V_paths){
                paths.add("v" + V_moveSize + Vpath);
            }
        }
        // diagonal moves
        for(int D_moveSize = 1; D_moveSize <= dc - sc && D_moveSize <= dr - sr; D_moveSize++){
            ArrayList<String> D_paths = getMazePathWithJumps(sr + D_moveSize, sc + D_moveSize,dr,dc);
            for (String Dpath:D_paths){
                paths.add("d" + D_moveSize + Dpath);
            }
        }

        return paths;
    }
}
