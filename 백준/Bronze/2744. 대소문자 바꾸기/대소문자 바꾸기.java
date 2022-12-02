import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        for(int i =0; i< a.length(); i++){
            char c = a.charAt(i);
            if(Character.isLowerCase(c)){
                System.out.print(String.valueOf(c).toUpperCase());
            }else{
                System.out.print(String.valueOf(c).toLowerCase());
            }
        }
    }
}