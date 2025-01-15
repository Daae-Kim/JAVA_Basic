import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cardNum = sc.nextInt();
        int goalNum = sc.nextInt();

        int[] arr = new int[cardNum];

        for (int i = 0; i < cardNum; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int calSum = goalNum;
        int result = 0;

        //숫자 3개의 합이 goalNum 과 가장 가까운 조합을 찾는 문제

        //3중 for 문으로 모든 조합 계산, 중간 조건에 목표 수와 같으면 out, 가까운 수는 저장 후 출력

        for (int i = 0; i < cardNum-2; i++) {
            for (int j = i+1; j < cardNum-1; j++) {
                for (int k = j+1; k < cardNum; k++) {
                    sum = arr[i] + arr[j] + arr[k];

                    if (sum == goalNum) {
                        System.out.println(goalNum);
                        return;
                    }
                    if ((goalNum-sum)>0&&(goalNum - sum) < calSum) {
                        calSum = (goalNum - sum);
                        result = sum;
                    }
                }
            }
        }
        System.out.println(result);

    }


    // 삼중 for 문의 시작과 끝 수를 생각하는 과정에서 헷갈렸다.
    // goalNum - sum 이 음수인 경우를 고려해야한다.
}