import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int size = String.valueOf(n).length();
        int min = n-(size*9);
        int result =0;
        for(int i =min; i<n; i++){
            int sum=i;
            int cal =i;
            while(cal>0){
                sum = sum + cal%10;
                cal = cal/10;
            }
            if(sum == n){
                result = i;
                break;
            }
        }
        System.out.print(result);

    }
}