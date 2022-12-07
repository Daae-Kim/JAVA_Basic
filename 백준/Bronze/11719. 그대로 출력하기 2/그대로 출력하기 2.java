import java.io.*;
import java.nio.Buffer;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String st = "";
            while((st=br.readLine())!=null){
                System.out.println(st);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}