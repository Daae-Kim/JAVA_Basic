import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int[][] map;
    static int N;
    static boolean found;

    public static void main(String[] args) {

        // 게임구역의 크기 N
        // 게임판의 구역이 주어진다.
        // -1에 도달하면 HaruHaru, 아니면 Hing
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N][N];

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                map[i][j]= sc.nextInt();
            }
        }

        dfs(0,0);

        if(!found){
            System.out.println("Hing");
        }

    }

    static void dfs(int x, int y){
        //범위 체크
        if(x<0 || x>=N || y<0 || y>=N) return;
        if(map[x][y] == -1){
            System.out.println("HaruHaru");
            found = true;
            return; //메서드 종료, 나가기
        }
        int jump = map[x][y];
        if(jump ==0)return;

        dfs(x+jump, y); // 이동 숫자를 아래로 이용하는 경우의 수
        dfs(x, y+jump); // 이동 숫자를 오른쪽으로 이용하는 경우의 수
    }

}