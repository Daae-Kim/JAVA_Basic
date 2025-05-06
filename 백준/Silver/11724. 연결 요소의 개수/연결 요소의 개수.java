import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    public static void main(String[] args) {
        //dfs 실행 개수 : 연결 요소 개수
        //정점 개수 N과 간선의 개수 M이 주어진다.
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        int m = sc.nextInt();
        graph = new ArrayList[n+1];
        visited = new boolean[n+1];

        for(int i =1; i<=n; i++){
            graph[i] = new ArrayList<>();
        }

        //m개의 줄에 양끝점 u,v 가 주어진다.
        for(int i =0; i<m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }

        for(int i =1; i<=n; i++){
            if(!visited[i]){
                dfs(i);
                count++;
            }
        }
        System.out.println(count);


    }
    static void dfs(int node){
        visited[node] = true;
        for(int next : graph[node]){
            if(!visited[next]){
                dfs(next);
            }
        }
    }
}