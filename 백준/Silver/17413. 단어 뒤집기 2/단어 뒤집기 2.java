import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {


        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int index =0;

        //< 이면 >일때까지 그대로 출력(sb.append)
        //문자이면 " " 만날때까지 후입선출 진행 -> 스택에 넣고, 바로 빼기
        //" "는 sb.append
        //flag ...?

        while(index < str.length()){
            if(str.charAt(index) == '<'){
                while(true){
                    sb.append(str.charAt(index));
                    index++;
                    if(str.charAt(index) == '>'){
                        sb.append(str.charAt(index));
                        index++;
                        break;
                    }
                }
            }
            else if(str.charAt(index) == ' '){
                sb.append(str.charAt(index));
                index++;
            }
            else{
                while(index < str.length() && str.charAt(index) != ' ' && str.charAt(index) != '<' && str.charAt(index) != '>'){
                    stack.push(str.charAt(index));
                    index++;
                }
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }

            }
        }

        System.out.println(sb);





    }
}