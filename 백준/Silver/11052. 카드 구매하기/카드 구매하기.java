import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int n = sc.nextInt();
         int[] priceArr = new int[n+1];
         int[] dp = new int[n+1];


         for(int i =1; i<= n; i++){
             priceArr[i] = sc.nextInt();
         }

         for(int i =1; i<=n; i++){
             for(int j =1; j<=i; j++){
                 dp[i] = Math.max(dp[i-j]+priceArr[j], dp[i]);
             }
         }

         System.out.println(dp[n]);

    }
}