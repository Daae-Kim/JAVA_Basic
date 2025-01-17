import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i] = sc.nextInt();
        }
        int count =0;

        //2부터 숫자보다 작은 수중, 나머지가 0 이면 count ++

        for (int j : arr) {
            if (isPrime(j)) {
                count++;
            }
        }

        System.out.println(count);

    }

    public static boolean isPrime(int num){
        if(num <2){
            return false;
        }
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}