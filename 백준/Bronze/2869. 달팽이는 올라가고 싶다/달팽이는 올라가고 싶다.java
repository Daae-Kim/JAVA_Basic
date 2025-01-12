import static java.lang.Integer.parseInt;

import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Main {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();

        int distance = v-b;
        int day = a-b;

        if(distance % day != 0){
            System.out.println(distance/day +1);
        }else System.out.println(distance/day);

    }


}