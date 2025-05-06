import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static boolean[] visited;
    static ArrayList<Integer>[] graph;
    static int count;

    public static void main(String[] args) {

        // 컴퓨터 수, 컴퓨터 쌍의 수
        // 1번 컴퓨터가 걸렸을때 1번을 통해 걸리게되는 컴퓨터의 수를 출력
        // 1번과 연결된 노드 수를 출력한다.
        Scanner sc = new Scanner(System.in);
        int computer = sc.nextInt();
        int nodeNum = sc.nextInt();

        graph = new ArrayList[computer+1];
        visited = new boolean[computer+1];

        for(int i =0; i<=computer; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i =0; i<nodeNum; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }

        dfs(1);
        System.out.println(count-1);


    }

    static void dfs(int node){
        count++;
        visited[node] = true;
        for(int next : graph[node]){
            if(!visited[next]){
                dfs(next);
            }
        }

    }
}