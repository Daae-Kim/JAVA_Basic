import java.io.*;

class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=1; i<=N; i++){
            for(int k=1; k<i; k++){
                System.out.print(' ');
            }
            for(int k=N; k>=i; k--){
            System.out.print('*');
            }
            System.out.println();
        }
    }
}
