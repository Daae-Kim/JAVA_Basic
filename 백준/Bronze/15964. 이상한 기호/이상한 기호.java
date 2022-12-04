import java.io.*;
import java.util.StringTokenizer;
class Main {
    static void fun(long a, long b){
        long result =(a+b)*(a-b);
        System.out.println(result);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine(), " ");
        long a = Long.parseLong(s.nextToken());
        long b = Long.parseLong(s.nextToken());
        Main cal = new Main();
        Main.fun(a,b);
    }
}