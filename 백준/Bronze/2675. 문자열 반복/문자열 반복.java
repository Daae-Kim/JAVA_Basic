import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String str = "";
    for(int i =0; i<N; i++){
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        str = st.nextToken();
        for(int j=0; j<str.length(); j++){
            for(int k =0; k<M; k++){
                System.out.print(str.charAt(j));
            }
        }System.out.println("");
    }
    }
}