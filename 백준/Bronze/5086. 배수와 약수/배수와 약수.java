import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    //2차원 배열에서 가장 큰수의 위치를 찾고, 행과 열을 출력한다.
    //2차원 배열은 9*9 크기 이다.


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // a 가 b 의 약수이면 factor
        // a 가 b 의 배수이면 multiple
        // a 가 b 의 약수, 배수 모두 아니면 neither



        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a==0 && b==0){
                break;
            }

            if(isFactor(a, b)) {
                System.out.println("factor");
            } else if (isMultiple(a, b)) {
                System.out.println("multiple");
            }else System.out.println("neither");
        }

    }

    public static boolean isFactor(int a, int b) {
        return b % a == 0;
    }

    public static boolean isMultiple(int a, int b){
        return a % b == 0;
    }


}