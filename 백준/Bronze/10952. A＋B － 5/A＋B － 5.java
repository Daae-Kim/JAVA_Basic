import java.util.Scanner;
import static java.lang.System.*;

public class Main {
    public static void main(String[]s){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while(a!=0 && b!=0){
            out.println(a + b);
            a = sc.nextInt();
            b = sc.nextInt();
        }

    }}