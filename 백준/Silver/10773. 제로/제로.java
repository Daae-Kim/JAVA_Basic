import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //0이 들어오면 삭제
        //출력은 스택의 요소들의 합
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int output =0;
        Stack<Integer> stack = new Stack<>();


        for(int i =0; i<a; i++){
            int input = Integer.parseInt(br.readLine());
            if(input == 0){
                stack.pop();
            }
            else stack.push(input);
        }

        for (Integer integer : stack) {
            output += integer;
        }
        System.out.println(output);
    }
}