import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {

        //todo
        //x가 3으로 나누어 떨어지면 3으로 나눈다.
        //x가 2로 나누어 떨어지면, 2로 나눈다.
        //1을 뺀다.
        //3개의 연산으로 1을 만들고, 연산을 사용하는 횟수의 최솟값 구하기.
        //D[i] : i를 1로 만드는데 걸리는 최소 연산 횟수
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] D = new int[N+1];
        D[1]=0;
        for(int i=2; i<=N; i++) {
            D[i] = D[i - 1] + 1;
            if (i % 2 == 0) D[i] = Math.min(D[i], D[i / 2] + 1);
            if (i % 3 == 0) D[i] = Math.min(D[i], D[i / 3] + 1);
        }
        System.out.println(D[N]);
    }
}