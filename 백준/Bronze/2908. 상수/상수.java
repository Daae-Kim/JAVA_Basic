import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String str = st.nextToken();
        String str2 = st.nextToken();

        StringBuffer sb = new StringBuffer(str);
        StringBuffer sb2 = new StringBuffer(str2);
        String reverse = sb.reverse().toString();
        String reverse2 = sb2.reverse().toString();

        int number = 0;
        int number2 =0;
        try {
            number = Integer.parseInt(reverse);
            number2 = Integer.parseInt(reverse2);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
        if (number > number2) {
            System.out.println(number);
        } else if (number < number2) {
            System.out.println(number2);
        }
    }
}