import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //소문자, 대문자, 숫자, 공백의 개수를 구하는 프로그램

        //반복 횟수, 마지막 종료 문자 임시 처리


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s;

        while((s=br.readLine()) != null){
            int lowerCase =0;
            int upperCase =0;
            int numberCount =0;
            int blankCount =0;

            for(int i =0; i<s.length(); i++){
                if(s.charAt(i)==' '){
                    blankCount++;
                }
                if((s.charAt(i))<=90 && (s.charAt(i))>=65 ){
                    upperCase++;
                }
                if((s.charAt(i))<=122 && (s.charAt(i))>=97 ){
                    lowerCase++;
                }
                if((s.charAt(i))>=48 && (s.charAt(i))<=57 ){
                    numberCount++;
                }

            }
            sb.append(lowerCase + " " + upperCase + " " + numberCount + " "+ blankCount + "\n");

        }
        System.out.println(sb);

    }
    //charAt 으로 특정 범위이면, count 증가


}