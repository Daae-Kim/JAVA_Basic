import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        int result = 0; // 총 합

        //레이저 이면 막대기 개수만큼 Result 추가
        //막대기 끝이면 Result  +1

        Stack<Character> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        for(int i =0; i<input.length(); i++){
            if(input.charAt(i) == '('){
                stack.push(input.charAt(i));
            }
            if(input.charAt(i) == ')'){ // 닫힌 괄호가 들어올때 2가지 경우
                stack.pop();

                if(input.charAt(i-1)=='(') {//레이저 이면
                    result = result + stack.size(); // 기존의 막대기 개수만큼 더하기
                }
                else{
                    result = result +1; // 막대기 한개 종료이므로 조가 1개 추가
                }
            }
        }
        System.out.println(result);









    }
}