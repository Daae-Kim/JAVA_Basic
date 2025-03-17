import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //알파벳만 13글자씩 밀어서 만들기
        //숫자의 경우는 제외한다.

        //todo
        //대문자인 경우 대문자 +13
        //소문자인 경우 소문자 +13

        Scanner sc = new Scanner(System.in);

        char[] input = sc.nextLine().toCharArray();
        //String 불변, char 가변


        //알파벳 내에서 문자를 밀어야 한다. (z -> a)
        for(int i =0; i<input.length; i++){
            if(isLowerCase(input[i])){
                input[i] = (char)(input[i]+13);
                if(input[i] > 122){
                    input[i] = (char)(input[i]-122 +96);
                }
            }
            if(isUpperCase(input[i])){
                input[i] = (char)(input[i]+13);
                if(input[i] > 90){
                    input[i] = (char)(input[i]-90+64);
                }

            }
        }

        for(char c : input){
            System.out.print(c);
        }
    }

}