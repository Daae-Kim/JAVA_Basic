import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] order = new int[26];
        Arrays.fill(order, -1);
        String input = br.readLine();

        for(int i =0; i<input.length(); i++){
            char ch = input.charAt(i);

            if(order[ch -'a']==-1){
                order[ch - 'a'] = i;
            }
        }
        for(int i =0; i<26; i++){
            System.out.print(order[i]+" ");
        }
    }
}