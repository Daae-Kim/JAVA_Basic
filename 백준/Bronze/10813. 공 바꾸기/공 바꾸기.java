import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //n : 바구니번호, 공 개수
        //m : 공 교환 횟수

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // n개의 바구니 안에 들어있는 1부터 시작하는 공

        int[] arr = new int[n+1];
        for(int i =1; i<n+1; i++){
            arr[i] = i;
        }

        int temp = 0;

        //1번 부터 n 번인 공의 위치를 바꾼다.
        for(int k =0; k<m; k++){
            int i = sc.nextInt();
            int j = sc.nextInt();

            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for(int i =1; i<n+1; i++){
            System.out.print(arr[i]+" ");
        }

    }
}