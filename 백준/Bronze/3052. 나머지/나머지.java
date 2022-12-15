import java.io.*;
import java.util.HashSet;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> integerHashSet = new HashSet<Integer>();

        for(int i =0; i<10; i++){
            integerHashSet.add(Integer.parseInt(br.readLine())%42);
        }
        System.out.print(integerHashSet.size());
    }
}