import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    //2차원 배열에서 가장 큰수의 위치를 찾고, 행과 열을 출력한다.
    //2차원 배열은 9*9 크기 이다.


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max = -1;
        int row = 0;
        int col = 0;

        for (int i = 0; i < 9; i++){
            for (int j=0; j<9; j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j] > max){
                    max = arr[i][j];
                    row = i+1;
                    col = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(row + " " + col);

    }




}