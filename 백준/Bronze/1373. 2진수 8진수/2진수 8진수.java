import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binaryStr = sc.nextLine();
        BigInteger bi = new BigInteger(binaryStr, 2); // 2진수 문자열을 BigInteger로 변환
        System.out.println(bi.toString(8)); // 8진수 문자열로 출력
    }
}