import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int value = N*M*C;
        String result = Integer.toString(value);

        for(int i =0; i<10; i++){
            int count =0;
            for (int j = 0; j < result.length(); j++) {
                if((result.charAt(j)-'0')==i){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}