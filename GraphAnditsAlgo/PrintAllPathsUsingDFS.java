package GraphAnditsAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PrintAllPathsUsingDFS {
    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt){
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<HasPath.Edge>[] graph = new ArrayList[vtces];
        for(int i = 0; i < vtces; i++){
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for(int i = 0; i < edges; i++){
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new HasPath.Edge(v1, v2, wt));
            graph[v2].add(new HasPath.Edge(v2, v1, wt));
        }
        int src = Integer.parseInt(br.readLine());
        int dest = Integer.parseInt(br.readLine());
        boolean[] visited = new boolean[vtces];
        printAllPathsUsingDFS(graph, src, dest, visited,src+"");
    }
    public static void printAllPathsUsingDFS(ArrayList<HasPath.Edge>[] graph, int src, int dest, boolean[] visited, String PathSoFar){
        if(src == dest){
            System.out.println(PathSoFar);
            return;
        }
        visited[src] = true;
        for(HasPath.Edge edge : graph[src]){
            if(visited[edge.nbr] == false){
                printAllPathsUsingDFS(graph,edge.nbr,dest,visited,PathSoFar);
            }
        }
        visited[src] = false;
    }
}
