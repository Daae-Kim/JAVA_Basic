import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String st ="";
        st = br.readLine();
        int m=0;
        for(int j=0; j<st.length(); j++){
            m = m + Character.getNumericValue(st.charAt(j));
        }
        System.out.println(m);
    }
}