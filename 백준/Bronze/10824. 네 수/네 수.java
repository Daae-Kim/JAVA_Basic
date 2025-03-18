import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toChars;

import java.io.*;
import java.util.*;
import javax.swing.text.AttributeSet.CharacterAttribute;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        long num1 = Long.parseLong(a+b);

        String c = st.nextToken();
        String d = st.nextToken();

        long num2 = Long.parseLong(c+d);

        System.out.println(num1+num2);
    }

}