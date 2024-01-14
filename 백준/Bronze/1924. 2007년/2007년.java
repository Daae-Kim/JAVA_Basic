import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int inputMonth = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());
        int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] week = {"SUN","MON","TUE", "WED", "THU", "FRI","SAT"};
        int totalDays = day;
        for(int i=0; i< inputMonth - 1; ++i){
            totalDays += month[i];
        }
        System.out.println(week[totalDays % 7]);
    }
}
