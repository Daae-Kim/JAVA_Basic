import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {


        Deque<Integer> deque = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command){
                case "push_front" : deque.addFirst(Integer.parseInt(st.nextToken())); break;
                case "push_back" : deque.addLast(Integer.parseInt(st.nextToken())); break;
                case "pop_front" : sb.append(deque.isEmpty()? -1 :deque.pollFirst()).append("\n"); break;
                case "pop_back" : sb.append(deque.isEmpty()? -1 :deque.pollLast()).append("\n"); break;
                case "size" : sb.append(deque.size()).append("\n"); break;
                case "empty" : sb.append(deque.isEmpty()? 1 : 0).append("\n"); break;
                case "front" : sb.append(deque.isEmpty() ? -1 : deque.getFirst()).append("\n"); break;
                case "back" : sb.append(deque.isEmpty() ? -1 : deque.getLast()).append("\n"); break;

            }

        }
        System.out.println(sb);

    }
}