import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //첫째 줄에 테스트 케이스 개수가 주어진다.
        //공백을 단위로 단어를 뒤집어서 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i =0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                String word = st.nextToken();
                sb.append(new StringBuilder(word).reverse().append(" "));
            }

            sb.append("\n");
        }
        System.out.print(sb);
    }
}