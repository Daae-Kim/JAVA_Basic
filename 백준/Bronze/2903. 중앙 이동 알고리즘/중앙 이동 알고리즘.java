import static java.lang.Integer.parseInt;

import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    //2차원 배열에서 가장 큰수의 위치를 찾고, 행과 열을 출력한다.
    //2차원 배열은 9*9 크기 이다.

    public int calculateSquareNumber(int input){

        int square =1;
        for (int i = 0; i < input; i++) {
            square = square * 4;
        }

        int miniSquare = (int) (Math.sqrt(square));

        return miniSquare + 1;
    }

    public static void main(String[] args) {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        int miniDot = T.calculateSquareNumber(input);

        int dot = miniDot * miniDot;

        System.out.println(dot);



    }


}