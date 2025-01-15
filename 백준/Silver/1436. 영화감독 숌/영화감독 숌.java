import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int N = Integer.parseInt(br.readLine());

       int count = 1;
       int number = 666;

       while(count != N){
           number++;
           //System.out.println("number : "+ number);
           if(String.valueOf(number).contains("666")){
               count++; // N 번째 악마의 수 구하기
               //System.out.println("count : "+ count);
           }

       }
       System.out.println(number);
    }


}