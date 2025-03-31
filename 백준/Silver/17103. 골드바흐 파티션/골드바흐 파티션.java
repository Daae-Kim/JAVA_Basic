import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {

        //todo
        //두 소수의 합으로 자신을 나타낼 수 있는 수의 파티션 갯수
        // 수가 주어지면 그 수보다 작은 소수 찾기
        // 그중 두 수의 합으로 주어진 수를 나타낼 수 있는 조합 있는지 찾기
        //테스트 개수 만큼 반복
        //----
        //범위가 지정되었으므로 미리 소수 배열 만들기

        boolean[] primeArr = primeArr();

        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i =0; i<num; i++){
            int a = sc.nextInt();
            int count = 0;
            for(int j = 2; j<=a/2; j++){
                if(primeArr[j] && primeArr[a-j]){
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);



    }

    public static boolean[] primeArr(){

        int max = 1000000;
        boolean[] isPrime = new boolean[max+1];


        for(int i=0; i<isPrime.length; i++){
            isPrime[i] = true;
        }

        isPrime[0] = isPrime[1] = false;

        for(int i =2; i<=Math.sqrt(max); i++){
            if(isPrime[i]){
                for(int j = i*i; j<=max; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;

    }

}