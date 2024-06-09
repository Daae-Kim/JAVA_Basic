class Solution {
    public String solution(String s) {
        int a = s.length();
        String word;
        if(a%2 == 0){
            word = s.substring(a/2 -1, (a/2)+1);
        }else
            word = s.substring((a/2), (a/2)+1);
        return word;
    }
    public static void main(String[] args){
        Solution T = new Solution();
        System.out.println(T.solution("power"));
    }
}