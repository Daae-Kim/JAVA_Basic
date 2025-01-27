import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int stackMax =0;

        while(a -- > 0){
            int m = Integer.parseInt(br.readLine());
            //숫자가 이전에 넣은 숫자보다 크면 이전에 넣은 숫자 ~ 숫자 까지 스택에 넣기
            if(m > stackMax){
                //스택에 숫자 넣기
                for(int i = stackMax+1; i<= m; i++){
                    stack.push(i);
                    sb.append("+").append("\n");
                }
                stackMax = m;
            }
            else if(stack.peek() != m){
                System.out.println("NO");
                return;
            }



            if(stack.peek() == m){
            stack.pop();
            sb.append("-").append("\n");
            }

            //top 숫자가 숫자와 같으면 pop
            //peek 숫자가 숫자와 같지 않으면, no,

        }
        System.out.println(sb);
    }
}