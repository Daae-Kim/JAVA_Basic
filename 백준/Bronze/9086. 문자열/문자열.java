import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String a = br.readLine();
            System.out.print(a.charAt(0));
            System.out.println(a.charAt(a.length()-1));
        }
    }
}