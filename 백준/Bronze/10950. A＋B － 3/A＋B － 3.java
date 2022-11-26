import java.util.Scanner;
import static java.lang.System.*;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] arr = new int[a];
        int [] arr2 = new int[a];

        for(int i =0; i<a; i++){
            arr[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }
        for(int j =0; j<a; j++){
            out.println(arr[j]+arr2[j]);
        }
    }
}