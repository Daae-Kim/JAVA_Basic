import java.util.Scanner;
import static java.lang.System.*;

public class Main {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a < 0 || b > 10) {
               break;
            }else out.println(a + b);
        }
    }
}