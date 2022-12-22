import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int[26];
        int index = 0;
        int max =-1;

        for(int i =0; i<str.length(); i++){
            if('A' <= str.charAt(i) && str.charAt(i) <= 'Z'){
                index = (str.charAt(i)-'A');
                arr[index]++;
            }else{
                index = (str.charAt(i)-'a');
                arr[index]++;
            }
        }
        char result = '?';

        for(int j =0; j<26; j++){
            if(arr[j]>max){
                max = arr[j];
                result = (char)(j+65);
            }else if(arr[j]==max){
                result = '?';
            }
        }
        System.out.println(result);
    }
}
