package codechef.decChallange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vaccine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] parts = br.readLine().split(" ");
        int D1 = Integer.parseInt(parts[0]);
        int V1 = Integer.parseInt(parts[1]);
        int D2 = Integer.parseInt(parts[2]);
        int V2 = Integer.parseInt(parts[3]);
        int P = Integer.parseInt(parts[4]);
        System.out.println(Calcday(D1,V1,D2,V2,P));

    }
    public static int Calcday(int d1,int v1,int d2,int v2,int p){
        if(d1 == 1 && d2 == 1){
            if(p % (v1+v2) == 0)
                return p/(v1+v2);
            else return p/(v1+v2) + 1;
        }
        else if(d1 > d2){
            int remWork = p - (v2 * (d1-d2));
            if(remWork % (v1+v2) == 0){
                return remWork / (v1+v2) + (d1 - 1);
            }

            else {
                return (remWork / (v1+v2) + 1) + (d1 - 1);
            }

        }
        else if(d2 > d1){
            int remWork = p - (v2 * (d2-d1));
            if(remWork % (v1+v2) == 0)
                return (remWork / (v1+v2)) + (d2 - 1);
            else return (remWork / (v1+v2) + 1) + (d2 - 1);
        }
        else{
            if(p%(v1+v2) == 0)
                return (p/(v1+v2)) + (d1-1);
            else return (p/(v1+v2) +1) + (d1-1);
        }
    }
}

/*
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for(int i = 0; i < vtces; i++){
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for(int i = 0; i < edges; i++){
         String[] parts = br.readLine().split(" "); // 5 4 2 10 100
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      int src = Integer.parseInt(br.readLine());
      int dest = Integer.parseInt(br.readLine());
* */