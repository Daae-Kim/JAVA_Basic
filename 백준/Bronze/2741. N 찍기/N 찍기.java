import java.util.Scanner;
import static java.lang.System.*;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(in);
        int a = sc.nextInt();
        sc.close();

        for (int i = 1; i <= a; ++i) {
            out.println(i);
        }
    }
}