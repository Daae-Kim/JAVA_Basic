import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] m = new int[N];
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    for(int i =0; i<N; i++) {
        m[i] = Integer.parseInt(st.nextToken());
    }
    int k= m[0];
    int s=m[0];

    for(int i=1; i<N; i++){
        if(k<m[i]){
            k = m[i];
        }
        if(s>m[i]){
            s = m[i];
        }
    }
    System.out.print(s+" "+k);
    }
}