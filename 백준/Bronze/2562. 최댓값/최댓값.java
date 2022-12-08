import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m=0;
        int n=0;
        int count =0;
        for(int i=0; i<9; i++){
            n = Integer.parseInt(br.readLine());
            if(m<n){
                m=n;
                count =i+1;
            }
        }
        System.out.println(m);
        System.out.println(count);
    }
}