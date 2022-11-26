import java.util.Scanner;
import static java.lang.System.*;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        int b =1;

        for(int i = 1; i<=a; i++){
            b *= i ;
        }
        out.println(b);
    }
}