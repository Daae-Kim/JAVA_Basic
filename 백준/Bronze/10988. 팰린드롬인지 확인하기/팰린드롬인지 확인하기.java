import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1보다 크고, 100보다 작은 알파벡 소문자로만 이루어진 단어
        //팰린드롬이면 1, 아니면 0 출력


        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        if(isPalindrome(word)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }

    public static boolean isPalindrome(String word){
        String reverse = new StringBuilder(word).reverse().toString();
        return reverse.equals(word);

    }
}