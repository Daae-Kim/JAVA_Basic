import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //첫째 줄에 반복 횟수 T가 주어진다.
        //vps 이면 yes, 아니면 no 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        // 스택을 사용하는 문제!
        // 스택에 시작괄호가 있고, 닫는 괄호가 들어오면 시작 괄호를 pop
        // 스택에 괄호가 남아있다면 no
        // 만약 스택에 pop 괄호가 없다면 no
        // 만약 스택이 모두 비워졌다면 yes


        for(int i =0; i<T; i++){
            String input = br.readLine();
            String[] splitInput = input.split("");
            Stack<String> vps = new Stack<>();
            boolean isVPS = true;

            for (String s : splitInput) {
                if (s.equals("(")) {
                    vps.push(s);
                }else if (s.equals(")")) {
                    if(vps.isEmpty()){
                        isVPS = false;
                        break;
                    }
                    vps.pop();
                }
            }
            if(!isVPS || !vps.isEmpty()){
                sb.append("NO").append("\n");
            }else {
                sb.append("YES").append("\n");
            }

        }
        System.out.println(sb);



    }
}