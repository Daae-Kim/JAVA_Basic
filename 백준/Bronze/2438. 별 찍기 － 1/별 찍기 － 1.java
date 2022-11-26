import java.util.Scanner;
import static java.lang.System.*;

public class Main {
    public static void main(String[]s){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            for(int a=1; a<=i; a++){
                out.print("*");
            }out.println();
        }
    }}